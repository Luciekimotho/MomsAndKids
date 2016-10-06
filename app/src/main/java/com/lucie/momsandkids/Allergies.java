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
public class Allergies extends Fragment {

    private RecyclerView recyclerView;
    private AllergiesAdapter allergiesAdapter;
    private List<Allergy> allergiesList;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.allergies_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.allergiesRecyclerView);
        allergiesList = new ArrayList<>();
        allergiesAdapter = new AllergiesAdapter(getActivity(),allergiesList);

        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(allergiesAdapter);
        recyclerView.hasFixedSize();

        foodData();

        return view;
    }

    private void foodData(){
        Allergy allergy = new Allergy("Eggs","Egg allergy is like most allergy allergy reactions: It usually happens " +
                "within minutes to hours after eating eggs. \n" +
                "Kids with egg allergy have some of the reactions listed above, but a few may have a very strong reaction called " +
                "anaphylaxis.\n", "The best way to be sure a food is egg free is to read the label. " +
                "Here's how eggs, in their many forms, are listed on food labels:\n\n    dried egg\n    " +
                "egg white\n    egg white solids\n    egg yolk\n    egg solids\n    powdered egg\n    " +
                "whole egg\n\n", ""
                );
        allergiesList.add(allergy);

        allergy = new Allergy("Soy", "\"\n    wheezing\n    trouble breathing\n    coughing\n   " +
                " hoarseness\n    throat tightness\n    stomachache\n    vomiting\n    diarrhea\n " +
                "   itchy, watery, or swollen eyes\n    hives\n    red spots\n    swelling\n    " +
                "a drop in blood pressure, causing lightheadedness or loss of consciousness\n",
                "You should always read labels to see if a packaged food contains soy. Manufacturers of " +
                        "foods sold in the United States must state in understandable language whether foods " +
                        "contain any of the top eight most common allergens, including soy. The label should list " +
                        "\"soy\" in the ingredient list or say \"Contains soy\" after the list.","");
        allergiesList.add(allergy);

        allergy = new Allergy("Shellfish", "\n    Hives or welts\n    Flushed skin or rash\n    Face, tongue, or lip swelling\n" +
                "   Vomiting and/or diarrhea\n    Coughing or wheezing\n    Difficulty breathing\n    Loss of consciousness\n",
                "Shell fish products","");
        allergiesList.add(allergy);

        allergy = new Allergy("Milk", "Symptoms of cow's milk protein allergy will generally appear " +
                "within the first few months of life, often within days or weeks after introduction of cow's " +
                "milk-based formula into the diet. An infant can experience symptoms either very quickly after " +
                "feeding (rapid onset) or not until 7 to 10 days after consuming the cow's milk protein (slower onset). " +
                "Symptoms may also occur with exclusive breastfeeding if the mother ingests cow's milk.\n\nThe " +
                "slower-onset reaction is more common. Symptoms may include loose stools (possibly containing blood), " +
                "vomiting, gagging, refusing food, irritability or colic, and skin rashes, like eczema. " +
                "This type of reaction is more difficult to diagnose because the same symptoms may occur with other health " +
                "conditions. Most kids will outgrow this form of allergy after 2 years of age, although some might not outgrow " +
                "it until adolescence.\n\nRapid-onset reactions come on suddenly with symptoms that can include irritability, " +
                "vomiting, wheezing, swelling, hives, other itchy bumps on the skin, and bloody diarrhea.","Milk",
                "If you're formula feeding, your doctor may advise you to switch to a soy protein-based formula. If your infant " +
                        "can't tolerate soy, the doctor may have you switch to a hypoallergenic formula, in which the proteins are " +
                        "broken down into particles so that the formula is less likely to trigger an allergic reaction." +
                        "\n\nTwo major types of hypoallergenic formulas are available:\n    Extensively hydrolyzed" +
                        " formulas have cow's milk proteins that are broken down into small particles so they're less allergenic" +
                        " than the whole proteins in regular formulas. Most infants who have a milk allergy can tolerate these " +
                        "formulas, but in some cases, they still provoke allergic reactions.\n");
        allergiesList.add(allergy);

    }
}
