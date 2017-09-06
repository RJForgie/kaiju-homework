package com.example.ryanforgie.kaiju_homework;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public class Mothra extends Kaiju {

    public Mothra(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Flap flap";
    }

    public String move(){
        return "Mothra causes hurricane";
    }


}
