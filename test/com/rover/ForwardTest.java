package com.rover;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ForwardTest {

    @Test
    public void shouldYCoordinateIncreaseIfRoverIsFacingNorthDirection() {
        Rover rover = new Rover(2, 3, "N");
        Forward move = new Forward(rover);

        assertEquals(Arrays.asList(2, 4), move.straight());
    }
}
