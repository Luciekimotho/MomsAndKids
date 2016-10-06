package com.lucie.momsandkids;

/**
 * Created by kamau on 10/4/2016.
 */

public class Food {
    private String name;
    private String description;
    private int age;
    private String howTo;

    public Food(){

    }

    public Food(String mName, String mDescription, int mAge, String mHowTo){
        this.name = mName;
        this.description = mDescription;
        this.age = mAge;
        this.howTo = mHowTo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public  String getHowTo(){
        return howTo;
    }

    public void setHowTo(String howTo){
        this.howTo = howTo;
    }
}

