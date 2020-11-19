package lesson9.task3;

import lesson9.task3.figure.*;

import java.util.Random;

public class Generator {
    static Figure generateFigure() {
        int random = new Random().nextInt(6)+1;
        if(random == 1)
            return new Circle();
        if (random==2)
            return new Ellipse();
        if (random==3)
            return new EquilateralTriangle();
        if (random==4)
            return new Rectangle();
        if (random==5)
            return new RightTriangle();
        return new Square();
    }
}
