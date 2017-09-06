package com.example.ryanforgie.kaiju_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public class AirforceTest {

    Airforce airforce;
    Godzilla godzilla;

    @Before
    public void before(){

        airforce = new Airforce("Fighter Plane", 50, 10, 50);
        godzilla = new Godzilla("Ragnor", 100, 25);
    }

    @Test
    public void hasType(){
        assertEquals("Fighter Plane", airforce.getType());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(50, airforce.getHealthValue());
    }

    @Test
    public void canDamageKaiju() {
        airforce.attack(godzilla);
        assertEquals(90, godzilla.healthValue);
    }

    @Test
    public void canSuperAttackKaiju() {
        airforce.superAttack(godzilla);
        assertEquals(50, godzilla.healthValue);
    }

}
