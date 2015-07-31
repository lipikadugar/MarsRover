package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void shouldCheckIfThePosition2And3IsWithinThePlateau() {
        Plateau plateau = new Plateau(5, 5);

        assertEquals(true, plateau.isValid(2, 3));
    }

    @Test
    public void shouldCheckIfThePosition6And3IsWithinThePlateau() {
        Plateau plateau = new Plateau(5, 5);

        assertEquals(false, plateau.isValid(6, 3));
    }

    @Test
    public void shouldCheckIfThePosition0and0IsWithinThePlateau() {
        Plateau plateau = new Plateau(5, 7);

        assertEquals(true, plateau.isValid(0, 0));
    }
}
