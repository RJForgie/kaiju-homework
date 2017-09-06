package com.example.ryanforgie.kaiju_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ryanforgie on 06/09/2017.
 */

public class BridgeTest {

    Bridge bridge;
    Mothra mothra;


    @Before
    public void before(){

        mothra = new Mothra("Flappy", 75, 10);
        bridge = new Bridge("Golden Gate", 100);
    }

    @Test
    public void hasType(){
        assertEquals("Golden Gate", bridge.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, bridge.getHealthValue());
    }

    @Test
    public void canBeDamaged() {
        mothra.attack(bridge);
        assertEquals(90, bridge.healthValue);
    }

}
