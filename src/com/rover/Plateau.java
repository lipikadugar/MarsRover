package com.rover;

public class Plateau {
    private final int upperRightXCoordinate;
    private final int upperRightYCoordinate;

    public Plateau(int upperRightXCoordinate, int upperRightYCoordinate) {

        this.upperRightXCoordinate = upperRightXCoordinate;
        this.upperRightYCoordinate = upperRightYCoordinate;
    }

    public boolean isValid(int positionX, int positionY) {
        return (positionX >= 0 && positionX <= upperRightXCoordinate) &&
                (positionY >= 0 && positionY <= upperRightYCoordinate);
    }
}
