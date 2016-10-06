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

public class AllergiesAdapter extends RecyclerView.Adapter<AllergiesAdapter.AllergyViewHolder> {
    private Context mContext;
    private List<Allergy> allergyList;

    public class AllergyViewHolder extends RecyclerView.ViewHolder{
        public TextView allergy, symptoms,to_avoid, alternative;

        public AllergyViewHolder(View itemView) {
            super(itemView);
            allergy = (TextView) itemView.findViewById(R.id.allergy);
            symptoms = (TextView) itemView.findViewById(R.id.symptoms);
            to_avoid = (TextView) itemView.findViewById(R.id.to_avoid);
            alternative = (TextView) itemView.findViewById(R.id.alternative);
           // foodImage = (ImageView) itemView.findViewById(R.id.foodImage);
        }
    }

    public AllergiesAdapter(Context mContext2, List<Allergy> allergyList2){
        this.mContext = mContext2;
        this.allergyList = allergyList2;
    }

    @Override
    public AllergyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.allergies_card, parent, false);
        return new AllergyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AllergyViewHolder holder, int position) {
        Allergy allergy = allergyList.get(position);

        holder.allergy.setText(allergy.getAllergy());
        holder.symptoms.setText(allergy.getSymptoms());
        holder.to_avoid.setText(allergy.getToAvoid());
        holder.alternative.setText(allergy.getAlternative());


    }

    @Override
    public int getItemCount() {
        Log.d("Food",""+allergyList.size());
        return allergyList.size();
    }

}
