package com.example.ryanforgie.kaiju_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public class ArmyTest {

    Army army;
    Godzilla godzilla;

    @Before
    public void before(){
        army = new Army("Tank", 75, 15, 50);
        godzilla = new Godzilla("Ragnor", 100, 25);
    }

    @Test
    public void hasType(){
        assertEquals("Tank", army.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(75, army.getHealthValue());
    }

    @Test
    public void canDamageKaiju() {
        army.attack(godzilla);
        assertEquals(85, godzilla.healthValue);
    }

    @Test
    public void canSuperAttackKaiju() {
        army.superAttack(godzilla);
        assertEquals(50, godzilla.healthValue);
    }

}
