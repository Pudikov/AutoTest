package lesson5.task1;

import java.util.Random;

public class Application {


    public static void main(String[] args) {
        Random rand = new Random();
        final int[] dividends = new int[6];
        final int[] dividers = new int[8];
        final int[][] result = new int[6][8];
        for (int i = 0; i < dividends.length; i++) {
            dividends[i] = rand.nextInt(6) + 4;
            System.out.print(dividends[i]);
        }
        System.out.println();
        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = rand.nextInt(4);
            System.out.print(dividers[i]);
        }
        System.out.println();
        System.out.println();


        for (int i = 0; i < dividends.length; i++) {
            for (int j = 0; j < dividers.length; j++) {
                try {
                    result[i][j] = dividends[i] / dividers[j];
                } catch (ArithmeticException ate) {
                    result[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < dividends.length; i++) {
            for (int j = 0; j < dividers.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
