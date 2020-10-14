package lesson5.task3;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

        final int total = rndMinMax(500, 1000);
        int count = 0;
        int r = 0;

        for (int i = 0; i < total; i++) {
            try {
                r = rndMax(4) / rndMax(4);
            } catch (ArithmeticException ae) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int rndMax(int max) {
        return (int) (Math.random() * ++max);

    }

    public static int rndMinMax(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
