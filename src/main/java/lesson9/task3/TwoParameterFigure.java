package lesson9.task3;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected int param1;
    protected int param2;
    public TwoParameterFigure(){
     param1 = new Random().nextInt(10) + 1;
     param2 = new Random().nextInt(10) + 1;

    }
    public int getparam1(){
        return param1;
    }
    public int getParam2(){
        return param2;
    }
}
