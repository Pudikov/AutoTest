package lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {
  static   Random random = new Random();

  static   int length = random.nextInt(6) + 4;

    public static String generate() {
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
