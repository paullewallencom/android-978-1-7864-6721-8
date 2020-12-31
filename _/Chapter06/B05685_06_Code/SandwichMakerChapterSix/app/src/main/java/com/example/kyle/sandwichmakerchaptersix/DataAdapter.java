package com.example.kyle.sandwichmakerchaptersix;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.kyle.sandwichmakerchaptersix.fillings.Cheese;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Cheese> cheeses;

    public DataAdapter(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View cheeseView = inflater.inflate(R.layout.item_view, parent, false);
        // View cheeseView = inflater.inflate(R.layout.grid_layout, parent, false);

        return new ViewHolder(cheeseView);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int position) {
        Cheese cheese = cheeses.get(position);

        ImageView imageView = viewHolder.imageView;
        imageView.setImageResource(cheese.getImage());

        TextView nameView = viewHolder.nameView;
        nameView.setText(cheese.getName());
    }

    @Override
    public int getItemCount() {
        return cheeses.size();
    }

    public void removeItem(int position) {
        cheeses.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, cheeses.size());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView nameView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.item_image);
            nameView = (TextView) itemView.findViewById(R.id.item_name);
        }
    }
}
