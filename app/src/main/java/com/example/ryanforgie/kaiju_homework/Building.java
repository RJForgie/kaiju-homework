package com.example.ryanforgie.kaiju_homework;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public abstract class Building implements Damageable {

    String name;
    int healthValue;


    public Building(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;

    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

}
