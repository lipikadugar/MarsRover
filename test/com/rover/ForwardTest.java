package com.rover;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ForwardTest {

    @Test
    public void shouldYCoordinateIncreaseIfRoverIsFacingNorthDirection() {
        Forward move = new Forward(2, 3);

        assertEquals(Arrays.asList(2, 4), move.straight());
    }

    @Test
    public void shouldBe3And7IfRoverPositionIs3And6AndFacingNorthDirection() {
        Forward move = new Forward(3, 6);

        assertEquals(Arrays.asList(3, 7), move.straight());
    }
}
