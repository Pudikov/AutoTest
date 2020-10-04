package lesson2.task2;

public class Board {


    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                board[j][i] = (j + i) % 2;
                // board[j][i]++;
            }
        }


        // Вывод на экран FOR

        for (int[] ints : board) {
            for (int i = 0; i < board.length; i++)
                System.out.print(ints[i]);
            System.out.println();

        }
        System.out.println();


        // Вывод на экран FOR Each

        for (int[] i : board) {
            for (int m : i)
                System.out.print(m);
            System.out.println();
        }
        System.out.println();


        // Вывод на экран While

        int i = 0;
        int j = 0;
        while (i < board.length) {
            while (j < board.length) {
                System.out.print(board[i][j++]);
            }
            System.out.println();
            i++;
            j = 0;
        }


    }
}
