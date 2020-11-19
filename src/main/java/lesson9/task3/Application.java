package lesson9.task3;

import lesson7.task1.MyArrayList;
import lesson9.task3.figure.RightTriangle;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> figures = new MyArrayList<>();
        for (int i = 0; i < 18; i++) {
            figures.add(Generator.generateFigure());
        }
            for (Object figure:figures){
                if (figure instanceof OneParameterFigure)
                    System.out.printf("%s [%d]: Длина - %.1f, Площадь - %.1f.%n",
                            figure.getClass().getSimpleName(),((OneParameterFigure) figure).getparam1(),((OneParameterFigure) figure).getLength(),((OneParameterFigure) figure).getLength());
            if (figure instanceof TwoParameterFigure)
                System.out.printf("%s [%d, %d]: Длина - %.1f, Площадь - %.1f.%n",
                        figure.getClass().getSimpleName(),((TwoParameterFigure) figure).getparam1(),((TwoParameterFigure) figure).getParam2(),((TwoParameterFigure) figure).getLength(),((TwoParameterFigure) figure).getArea());
            }
            System.out.println();
        for (Object figure:figures){
            if (figure instanceof RightTriangle)
                System.out.printf("Гипотенуза треугольника [%d, %d] равна %.1f.%n",((RightTriangle) figure).getparam1(),((RightTriangle) figure).getParam2(),((RightTriangle) figure).getHypotenuse());
        }
    }
}
