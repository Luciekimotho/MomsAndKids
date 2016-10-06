package com.lucie.momsandkids;

/**
 * Created by kamau on 10/4/2016.
 */

public class Allergy{
    private String allergy;
    private String symptoms;
    private String toAvoid;
    private String alternative;

    public  Allergy(){

    }

    public  Allergy(String mAllergy, String mSymptoms, String mToAvoid, String mAlternative){
        this.allergy = mAllergy;
        this.symptoms = mSymptoms;
        this.toAvoid = mToAvoid;
        this.alternative = mAlternative;
    }

    public String getAllergy(){
        return allergy;
    }

    public void setAllergy(String allergy){
        this.allergy = allergy;
    }

    public String getSymptoms(){
        return symptoms;
    }

    public void setSymptoms(String symptoms){
        this.symptoms = symptoms;
    }

    public String getToAvoid(){
        return toAvoid;
    }

    public void setToAvoid(int age){
        this.toAvoid = toAvoid;
    }

    public  String getAlternative(){
        return alternative;
    }

    public void setAlternative(String alternative){
        this.alternative = alternative;
    }
}

