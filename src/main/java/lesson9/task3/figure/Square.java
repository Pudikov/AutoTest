package lesson9.task3.figure;

import lesson9.task3.OneParameterFigure;

public class Square extends OneParameterFigure {
    @Override
    public double getLength() {
        return 4*param1;
    }

    @Override
    public double getArea() {
        return param1*param1;
    }
}
