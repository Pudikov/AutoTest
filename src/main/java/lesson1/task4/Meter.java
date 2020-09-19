package lesson1.task4;

public class Meter {
    public static void main(String[] args) {
    Meter inst = new Meter();
    System.out.println(inst.mer(115));
    System.out.println(inst.mer(800));
    System.out.println(inst.mer(278));
    }
    // Определяет количество полных метров
    int mer(int n) {
        int m = n / 100;
        return m;
    }
}
