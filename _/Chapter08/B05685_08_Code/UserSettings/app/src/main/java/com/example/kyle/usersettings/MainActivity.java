package com.example.kyle.usersettings;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private User user = User.getInstance();

    private EditText editBuilding;
    private EditText editFloor;
    private EditText editDesk;
    private EditText editPhone;
    private EditText editEmail;
    private TextView textPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBuilding = (EditText) findViewById(R.id.edit_building);
        editFloor = (EditText) findViewById(R.id.edit_floor);
        editDesk = (EditText) findViewById(R.id.edit_desk);
        editPhone = (EditText) findViewById(R.id.edit_phone);
        editEmail = (EditText) findViewById(R.id.edit_email);

        textPreview = (TextView) findViewById(R.id.text_preview);

        Button actionLoad = (Button) findViewById(R.id.action_load);
        Button actionSave = (Button) findViewById(R.id.action_save);
        Button actionPreview = (Button) findViewById(R.id.action_preview);

        actionLoad.setOnClickListener(this);
        actionSave.setOnClickListener(this);
        actionPreview.setOnClickListener(this);

        loadPrefs();
    }

    @Override
    public void onPause() {
        super.onPause();
        savePrefs();
    }

    public void loadPrefs() {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("prefs", MODE_PRIVATE);

        user.setBuilding(prefs.getString("building", null));
        user.setFloor(prefs.getString("floor", null));
        user.setDesk(prefs.getString("desk", null));
        user.setPhone(prefs.getString("phone", null));
        user.setEmail(prefs.getString("email", null));
        user.setUserId(prefs.getString("user_id",null));

        if (prefs.getBoolean("new_user", true)) {
            // Display welcome dialog
            // Add free credit for new users
            String uuid = UUID.randomUUID().toString();
            prefs.edit().putString("user_id", uuid);
            prefs.edit().putBoolean("new_user", false).apply();
        }

        textPreview.setText(user.getBuilding());
    }

    public void savePrefs() {
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("building", user.getBuilding());
        editor.putString("floor", user.getFloor());
        editor.putString("desk", user.getDesk());
        editor.putString("phone", user.getPhone());
        editor.putString("email", user.getEmail());

        editor.apply();

        textPreview.setText(user.getBuilding());
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.action_load:
                loadPrefs();
                break;

            case R.id.action_save:
                user.setBuilding(editBuilding.getText().toString());
                user.setFloor(editFloor.getText().toString());
                user.setDesk(editDesk.getText().toString());
                user.setPhone(editPhone.getText().toString());
                user.setEmail(editEmail.getText().toString());
                savePrefs();
                break;

            default:
                textPreview.setText(new StringBuilder()
                        .append(user.getBuilding()).append(", ")
                        .append(user.getFloor()).append(", ")
                        .append(user.getDesk()).append(", ")
                        .append(user.getPhone()).append(", ")
                        .append(user.getEmail()).toString());
                break;
        }
    }
}
