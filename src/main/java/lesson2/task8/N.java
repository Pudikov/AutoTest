package lesson2.task8;

public class N {
    public static void main(String[] args) {
        int n = 3;
        switch (n) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                for (int i = 0; i < 2; i++) {
                    System.out.print("A");
                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    System.out.print("A");
                }
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    System.out.print("A");
                }
                break;
            default:
                for (int i = 0; i < 5; i++) {
                    System.out.print("A");
                }
        }
        System.out.println();
        switch (n) {
            default:
                System.out.print("AAAAA");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
    }
}