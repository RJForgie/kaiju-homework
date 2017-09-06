package com.example.ryanforgie.kaiju_homework;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public abstract class Vehicle implements Damageable, CanAttack, SuperAttack {

    String type;
    int healthValue;
    int attackValue;
    int superAttackValue;


    public Vehicle(String type, int healthValue, int attackValue, int superAttackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.superAttackValue = superAttackValue;

    }
    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void takeDamage(int damage) {
        this.healthValue -= damage;
    }

    public void attack(Damageable target) {
        target.takeDamage(this.attackValue);
    }

    public void superAttack(Damageable target) {
        target.takeDamage(this.superAttackValue);
    }
}
