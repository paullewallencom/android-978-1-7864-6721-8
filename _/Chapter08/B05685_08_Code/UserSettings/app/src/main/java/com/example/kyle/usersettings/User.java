package com.example.kyle.usersettings;

/**
 * Created by kyle on 07/08/2016.
 */
public class User {
    private static String building;
    private static String floor;
    private static String desk;
    private static String phone;
    private static String email;
    private static boolean newUser;
    private static String userId;


    private static User user = new User();

    public static User getInstance() {
        return user;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        User.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        User.floor = floor;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        User.desk = desk;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        User.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        User.email = email;
    }

    public boolean getNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        User.newUser = newUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        User.userId = userId;
    }
}
