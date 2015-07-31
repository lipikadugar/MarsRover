package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void shouldCheckIfThePositionIsWithinThePlateau() {
        Plateau plateau = new Plateau(5, 5);

        assertEquals(true, plateau.isValid(2, 3));
    }
}
