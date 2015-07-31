package com.rover;

public class Plateau {
    private final int upperRightXCoordinate;
    private final int upperRightYCoordinate;

    public Plateau(int upperRightXCoordinate, int upperRightYCoordinate) {

        this.upperRightXCoordinate = upperRightXCoordinate;
        this.upperRightYCoordinate = upperRightYCoordinate;
    }

    public boolean isValid(int positionX, int positionY) {
        return positionX < upperRightXCoordinate && positionX > 0 && positionY < upperRightYCoordinate && positionY > 0;
    }
}
