package lesson6.task1;

import java.util.Random;

public class PhoneGenerator {
    Random random = new Random();

    public String generate() {
        int a = random.nextInt(999);
        int b = random.nextInt(999);
        int c = random.nextInt(99);
        int d = random.nextInt(99);

        return String.format("+7(%d)%d-%d-%d%n", a, b, c, d);
    }
}
