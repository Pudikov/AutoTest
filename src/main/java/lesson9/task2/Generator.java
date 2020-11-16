package lesson9.task2;


import java.util.Random;

public class Generator {

    static Object generate() {
        int randomPercent = new Random().nextInt(100);
        if (randomPercent < 25)
            return new Square();
        if (randomPercent < 50)
            return new Circle();
        if (randomPercent < 75)
            return new Box();
        return new Table();
    }
}


