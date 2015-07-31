package com.rover;

import java.util.HashMap;

public class Parser {
    private String direction;
    private int positionY;
    private int positionX;
    private HashMap<String, Operations> input;

    public Parser(int positionY, int positionX, String direction) {
        this.direction = direction;
        this.positionY = positionY;
        this.positionX = positionX;
        input = new HashMap<>();
        input.put("M", new Forward(this.positionX, this.positionY, this.direction));
        input.put("L", new Left(this.direction));
        input.put("R", new Right(this.direction));
    }

    public Operations getClassObject(String key) {
        return input.get(key);
    }
}