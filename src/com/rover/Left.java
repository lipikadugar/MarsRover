package com.rover;

import java.util.Objects;

public class Left {
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
        return direction;
    }
}
