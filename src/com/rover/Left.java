package com.rover;

import java.util.List;
import java.util.Objects;

public class Left implements Operations {
    private String direction;

    public Left(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        if (Objects.equals(direction, "E"))
            direction = "N";
        else if (Objects.equals(direction, "S"))
            direction = "E";
        else if (Objects.equals(direction, "W"))
            direction = "S";
        else if (Objects.equals(direction, "N"))
            direction = "W";
        return direction;
    }

    @Override
    public List<Integer> execute(int positionX, int positionY, String direction) {

        return null;
    }
}
