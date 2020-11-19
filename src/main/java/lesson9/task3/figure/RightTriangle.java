package lesson9.task3.figure;

import lesson9.task3.TwoParameterFigure;

public class RightTriangle extends TwoParameterFigure {
  public  double c;

    public double getHypotenuse() {

        return c = Math.sqrt((param1 * param1) + (param2 * param2));
    }

    @Override
    public double getLength() {
        return c+param2+param2;
    }

    @Override
    public double getArea() {
        return param1*param2/2;
    }

}
