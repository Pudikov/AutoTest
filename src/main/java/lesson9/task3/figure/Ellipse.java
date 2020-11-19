package lesson9.task3.figure;

import lesson9.task3.TwoParameterFigure;

public class Ellipse extends TwoParameterFigure {
    @Override
    public double getLength() {
        return 3.14 * (param1 + param2);
    }

    @Override
    public double getArea() {
        return 3.14 * param1 * param2;
    }
}
