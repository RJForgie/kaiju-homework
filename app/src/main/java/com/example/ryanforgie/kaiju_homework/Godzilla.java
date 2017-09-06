package com.example.ryanforgie.kaiju_homework;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "Rawr";
    }

    public String move(){
        return "Godzilla kicks over building";
    }


}
