package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldGiveObjectForViewClassIfOptionIsListBooks() {

        Parser parse = new Parser(2, 3, "N");
        Operations move = new Forward(2, 3, "N");
        assertEquals(move.getClass(), parse.getClassObject("M").getClass());
    }
}
