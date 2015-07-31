package com.rover;

import java.util.ArrayList;
import java.util.List;

public class Forward {
    private Rover rover;

    public Forward(Rover rover) {

        this.rover = rover;
    }

    public List<Integer> straight() {
        ArrayList<Integer> position = new ArrayList<>();
        position.add(2);
        position.add(4);
        return position;
    }
}
