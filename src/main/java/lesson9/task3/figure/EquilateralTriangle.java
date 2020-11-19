package lesson9.task3.figure;

import lesson9.task3.OneParameterFigure;

public class EquilateralTriangle extends OneParameterFigure {
    @Override
    public double getLength() {

        return 3 * param1;
    }

    @Override
    public double getArea() {

        return (param1 * param1 * Math.sqrt(3)) / 4;
    }
}
