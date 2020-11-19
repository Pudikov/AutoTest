package lesson9.task3.figure;

import lesson9.task3.OneParameterFigure;

public class Circle extends OneParameterFigure {
    @Override
    public double getLength() {
        return 2 * 3.14 * param1;
    }

    @Override
    public double getArea() {
        return 3.14 * param1 * param1;
    }
}
