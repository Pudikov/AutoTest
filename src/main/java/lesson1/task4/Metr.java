package lesson1.task4;

public class Metr {
    public static void main(String[] args) {
    Metr inst = new Metr();
    System.out.println(inst.metr(115));
    System.out.println(inst.metr(800));
    System.out.println(inst.metr(278));
    }
    int metr (int n) {
        int m = n / 100;
        return m;
    }
}
