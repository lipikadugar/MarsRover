package com.rover;

import java.util.Objects;

public class Right {
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
}
