package lesson6.task4;

import java.util.Random;
import java.util.regex.Pattern;

public class TemplateSeriesNumber {
    private static char randomSTRING(int min, int max) {
        return (char) (new Random().nextInt(max - min) + min);
    }

    static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    static StringBuilder sb = new StringBuilder();
    static Random random = new Random();

    public static String dp() {
        int a = random.nextInt(99);
        int b = random.nextInt(9999999);
        return String.format("%d %d%n", a, b);
    }

    public static String mt() {
        //  int a = random.nextInt(99);
        sb = new StringBuilder().append(randomSTRING('А', 'Я'));
        int b = random.nextInt(9999999);
        return String.format("%s %d%n", sb, b);
    }

    public static String fp() {
        //   StringBuilder sb = new StringBuilder().append(randomSTRING('А', 'Я'));
        for (int i = 0; i < 25; i++) {
             sb.append(s.charAt(random.nextInt(s.length())));
        }
        return sb.toString();
    }

    public static String pcrf() {
        int a = random.nextInt(99);
        int c = random.nextInt(99);
        int b = random.nextInt(999999);
        return String.format("%d %d %d%n", a, c, b);
    }

    public static String rcp() {
        int a = random.nextInt(99);
       // int c = random.nextInt(99);
        int b = random.nextInt(9999999);
        return String.format("%d %d%n", a,b);
    }

}