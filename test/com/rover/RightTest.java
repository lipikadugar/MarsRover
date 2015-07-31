package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RightTest {

    @Test
    public void shouldBeFacingEastIfFacingNorthDirection() {
        Right move = new Right("N");

        assertEquals("E", move.right());
    }
}
