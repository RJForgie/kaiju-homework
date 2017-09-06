package com.example.ryanforgie.kaiju_homework;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public abstract class Kaiju implements Damageable, CanAttack {

    String name;
    int healthValue;
    int attackValue;


    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;

    }
    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void attack(Damageable target) {
        target.takeDamage(this.attackValue);
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

}
