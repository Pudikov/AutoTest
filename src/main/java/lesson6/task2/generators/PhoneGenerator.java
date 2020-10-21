package lesson6.task2.generators;

import java.util.Random;

public class PhoneGenerator {

    static Random random = new Random();

    public static String generate() {
        int a = random.nextInt(999);
        int b = random.nextInt(999);
        int c = random.nextInt(99);
        int d = random.nextInt(99);

        return String.format("+7(%d)%d-%d-%d%n", a, b, c, d);
    }
}
