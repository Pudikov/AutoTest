package lesson9.task2;

import java.util.Random;

public class Action {
    static Object action(Object object) {
        int randomPercent = new Random().nextInt(100);
        if (randomPercent < 50)
            return (Drawable) () -> {
            };
        return (Movable) () -> {

        };
    }

}
