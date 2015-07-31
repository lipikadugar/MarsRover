package com.rover;

public class Right {
    private String direction;

    public Right(String direction) {

        this.direction = direction;
    }

    public String getDirection() {
        if (direction == "N")
            direction = "E";
        else if (direction == "S")
            direction = "W";
        return direction;
    }
}
