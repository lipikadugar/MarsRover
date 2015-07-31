package com.rover;

import java.util.ArrayList;
import java.util.List;

public class Forward {

    private final int positionX;
    private final int positionY;

    public Forward(int positionX, int positionY) {

        this.positionX = positionX;
        this.positionY = positionY;
    }

    public List<Integer> straight() {
        ArrayList<Integer> position = new ArrayList<>();
        position.add(positionX);
        position.add(positionY + 1);
        return position;
    }
}
