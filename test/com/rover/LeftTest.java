package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftTest {

    @Test
    public void shouldFaceNorthIfDirectionIsEast() {
        Left move = new Left("E");

        assertEquals("N", move.getDirection());
    }

    @Test
    public void shouldFaceEastIfDirectionIsSouth() {
        Left move = new Left("S");

        assertEquals("E", move.getDirection());
    }

    @Test
    public void shouldFaceSouthIfDirectionIsWest() {
        Left move = new Left("W");

        assertEquals("S", move.getDirection());
    }

    @Test
    public void shouldFaceWestIfDirectionIsNorth() {
        Left move = new Left("N");

        assertEquals("W", move.getDirection());
    }
}
