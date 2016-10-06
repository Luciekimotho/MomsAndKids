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
public class AllergiesActivity extends Fragment {

    private RecyclerView recyclerView;
    private FoodAdapter foodAdapter;
    private List<Food> foodList;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.allergies_fragment, container, false);

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
        Food food = new Food("Lactose", "A rich source of carbohydrate and vitameins", 2,"Boil and then mash");
        foodList.add(food);

        food = new Food("Protein", "A rich source of carbohydrate and vitameins", 2,"Boil and then mash");
        foodList.add(food);

        food = new Food("Bananas", "A rich source of carbohydrate and vitameins", 2,"Boil and then mash");
        foodList.add(food);

        food = new Food("Bananas", "A rich source of carbohydrate and vitameins", 2,"Boil and then mash");
        foodList.add(food);

        food = new Food("Bananas", "A rich source of carbohydrate and vitameins", 2,"Boil and then mash");
        foodList.add(food);

        food = new Food("Bananas", "A rich source of carbohydrate and vitameins", 2,"Boil and then mash");
        foodList.add(food);

    }
}
