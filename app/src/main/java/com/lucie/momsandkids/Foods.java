package com.lucie.momsandkids;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamau on 8/22/2016.
 */
public class Foods extends Fragment {

    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private List<Food> foodList;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.food_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.foodRecyclerView);
        foodList = new ArrayList<>();
        foodAdapter = new FoodAdapter(getActivity(), foodList);

        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.hasFixedSize();

        foodData();

        return view;
}

    private void foodData(){
        Food food = new Food("Milk. Breastmilk or formula should be your child’s sole nutritional source for the first six months","Baby should be fed at least every 2-3 hours on demand. With attempts to feed 8-12 times a day.", 1,"Exclusive breastfeeding");
        foodList.add(food);

        food =  new Food("Milk", "", 2,"Exclusive breastfeeding");
        foodList.add(food);

        food =  new Food("Milk", "", 3,"Exclusive breastfeeding");
        foodList.add(food);

        food = new Food("Single grain cereals.", "", 4,"Mash semi solids made of cereal and legumes, softened with breast milk. Add groundnuts, small pieces of mashed or chopped animal proteins");
        foodList.add(food);

        food = new Food("Bananas", "", 5,"Mix with baby formula or breast milk, or water on occasion.");
        foodList.add(food);

        food = new Food("Pureed or strained fruits (bananas, pears, apples, apricots, prunes).", "", 6,"Wash all fresh fruits, then bake, boil, " +
                "or steam until soft. You can puree in either a blender or a food processor, or use a small hand food mill; add a little liquid like breast milk, baby formula, or water at first.");
        foodList.add(food);

    }
}
