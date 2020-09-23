package lesson2.task5;

import java.util.Random;

public class NxM {
    public static void main(String[] args) {
        int[][] nm = new int[3][5];
        for (int i = 0; i < nm.length; i++) {
            for (int j = 0; j < nm.length; j++)
                nm[i][j] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < nm.length; i++) {
            for (int j = 0; j < nm.length; j++) {
                System.out.print(nm[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < nm.length; i++) {
            for (int j = i + 1; j < nm.length; j++) {
                int temp = nm[i][j];
                nm[i][j] = nm[j][i];
                nm[j][i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < nm.length; i++) {
            for (int j = 0; j < nm.length; j++) {
                System.out.print(nm[i][j]);
            }
            System.out.println();
        }
    }

}

