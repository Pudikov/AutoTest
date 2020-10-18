package lesson6.task1;

import java.util.Random;

public class AgeGenerator {

    public int generate() {
        return randomSTRING(20, 75);
    }

    private static char randomSTRING(int min, int max) {
        return (char) (new Random().nextInt(max - min) + min);
    }
}
