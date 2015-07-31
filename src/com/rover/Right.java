package com.rover;

import java.util.List;
import java.util.Objects;

public class Right implements Operations {
    private String direction;

    public Right(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        if (Objects.equals(direction, "N"))
            direction = "E";
        else if (Objects.equals(direction, "S"))
            direction = "W";
        else if (Objects.equals(direction, "W"))
            direction = "N";
        else if (Objects.equals(direction, "E"))
            direction = "S";
        return direction;
    }

    @Override
    public List<Integer> execute(int positionX, int positionY, String direction) {

        return null;
    }
}
