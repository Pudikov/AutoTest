package lesson1.task3;

public class Logic {
    boolean x;
    public static void main(String[] args) {
    Logic inst = new Logic();
    System.out.println(inst.logic(14));
    System.out.println(inst.logic(19));

    }
    // Возвращает логическую переменную
    boolean logic (int n) {
        int m = 0;
        if (m == n % 2)
            x = false;
        else
            x = true;
        return x;
    }
}
