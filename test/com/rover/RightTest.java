package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RightTest {

    @Test
    public void shouldBeFacingEastIfFacingNorthDirection() {
        Right move = new Right("N");

        assertEquals("E", move.getDirection());
    }

    @Test
    public void shouldBeFacingWestIfFacingSouthDirection() {
        Right move = new Right("S");

        assertEquals("W", move.getDirection());
    }

    @Test
    public void shouldBeFacingNorthIfFacingWestDirection() {
        Right move = new Right("W");

        assertEquals("N", move.getDirection());
    }
}
