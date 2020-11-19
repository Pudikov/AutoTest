package lesson9.task3;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {
    protected int param1;
    public  OneParameterFigure(){
     param1 = new Random().nextInt(10) + 1;
    }
    public int getparam1(){
        return param1;
    }
}
