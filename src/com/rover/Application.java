package com.rover;

import java.util.Objects;
import java.util.Scanner;

public class Application {
    Scanner in = new Scanner(System.in);
    private int upperRightXCoordinate;
    private int upperRightYCoordinate;
    private int positionX;
    private int positionY;
    private String direction;
    private String action;

    public void start () {
        System.out.println("Enter the upper Right coordinates of the plateau: ");
        upperRightXCoordinate = in.nextInt();
        upperRightYCoordinate = in.nextInt();
        Plateau plateau = new Plateau(upperRightXCoordinate, upperRightYCoordinate);

        System.out.println("Enter Rover's Position");
        positionX = in.nextInt();
        positionY = in.nextInt();
        direction = in.nextLine();

        System.out.println("Enter the actions of Rover");
        action = in.nextLine();

        Parser parse = new Parser(positionX, positionY, direction);

        if (plateau.isValid(positionX, positionY))
        {
            Operations action = parse.getClassObject(direction);
            if (Objects.equals(direction, "M"))
                System.out.println(action.execute(positionX, positionY, direction));
        }
    }
}
