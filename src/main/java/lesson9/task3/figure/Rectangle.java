package lesson9.task3.figure;

import lesson9.task3.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure {
    @Override
    public double getLength() {
        return 2 * (param1 + param2);
    }

    @Override
    public double getArea() {
        return param1 * param2;
    }
}
