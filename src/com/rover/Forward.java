package com.rover;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Forward {

    private int positionX;
    private int positionY;
    private String direction;

    public Forward(int positionX, int positionY, String direction) {

        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public List<Integer> straight() {
        ArrayList<Integer> position = new ArrayList<>();
        if (Objects.equals(direction, "N"))
            positionY += 1 ;
        else if (Objects.equals(direction, "S"))
            positionY -= 1 ;
        else if (Objects.equals(direction, "E"))
            positionX += 1 ;
        else if (Objects.equals(direction, "W"))
            positionX -= 1 ;
        position.add(positionX);
        position.add(positionY);
        return position;
    }
}

