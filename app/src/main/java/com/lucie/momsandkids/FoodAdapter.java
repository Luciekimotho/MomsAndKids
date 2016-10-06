package com.lucie.momsandkids;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kamau on 10/4/2016.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private Context mContext;
    private List<Food> foodList;

    public class FoodViewHolder extends RecyclerView.ViewHolder{
        public TextView name, age, description, howTo;
        ImageView foodImage;

        public FoodViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            age = (TextView) itemView.findViewById(R.id.age);
            description = (TextView) itemView.findViewById(R.id.descr);
            howTo = (TextView) itemView.findViewById(R.id.how_to);
           // foodImage = (ImageView) itemView.findViewById(R.id.foodImage);
        }
    }

    public FoodAdapter(Context mContext2, List<Food> foodList2){
        this.mContext = mContext2;
        this.foodList = foodList2;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_card, parent, false);
        return new FoodViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        Food food = foodList.get(position);

        holder.name.setText(food.getName());
        holder.description.setText(food.getDescription());
        holder.age.setText(String.valueOf( food.getAge()));
        holder.howTo.setText(food.getHowTo());

        Log.d("Food", ""+food.getName());
    }

    @Override
    public int getItemCount() {
        Log.d("Food",""+foodList.size());
        return foodList.size();
    }

}
