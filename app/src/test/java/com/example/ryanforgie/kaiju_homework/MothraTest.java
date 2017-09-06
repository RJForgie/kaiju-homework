package com.example.ryanforgie.kaiju_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public class MothraTest {

    Mothra mothra;
    Army army;

    @Before
    public void before(){

        mothra = new Mothra("Flappy", 75, 10);
        army = new Army("Tank", 75, 15, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Flappy", mothra.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(75, mothra.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(10, mothra.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Flap flap", mothra.roar());
    }

    @Test
    public void hasMove() {
        String result = mothra.move();
        assertEquals("Mothra causes hurricane", result);
    }

    @Test
    public void canDamageVehicle() {
        mothra.attack(army);
        assertEquals(65, army.healthValue);
    }

}
