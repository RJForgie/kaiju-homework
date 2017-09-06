package com.example.ryanforgie.kaiju_homework;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by ryanforgie on 06/09/2017.
 */



public class GodzillaTest {

    Godzilla godzilla;
    Army army;

    @Before
    public void before(){
        godzilla = new Godzilla("Ragnor", 100, 25);
        army = new Army("Tank", 75, 15, 50);
    }

    @Test
    public void hasName(){
        assertEquals("Ragnor", godzilla.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(25, godzilla.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("Rawr", godzilla.roar());
    }

    @Test
    public void canDamageVehicle() {
        godzilla.attack(army);
        assertEquals(50, army.healthValue);
    }

    @Test
    public void hasMove() {
        String result = godzilla.move();
        assertEquals("Godzilla kicks over building", result);
    }
}
