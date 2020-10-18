package lesson6.task1;

import java.util.Random;

public class NameGenerator {
    Random random = new Random();

    int length = random.nextInt(8) + 4;

    public String generate() {
        StringBuilder sb = new StringBuilder().append(randomSTRING('А', 'Я'));
        for (int i = 0; i < length; i++) {
            sb.append(randomSTRING('а', 'я'));
        }
        return sb.toString();

    }

    private static char randomSTRING(int min, int max) {
        return (char) (new Random().nextInt(max - min) + min);
    }
}
