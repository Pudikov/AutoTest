package lesson6.task2.generators;

import java.util.Random;

public class AgeGenerator {

    public static int generate() {
        return randomSTRING(20, 75);
    }

    private static char randomSTRING(int min, int max) {
        return (char) (new Random().nextInt(max - min) + min);
    }
}
