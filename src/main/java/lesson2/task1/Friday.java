package lesson2.task1;

public class Friday {
    String[] week = {"Пятница", " ", "это", " ", "лучшый", " ", "день", " ", "недели."};

    public static void main(String[] args) {
        Friday inst = new Friday();
        inst.printFor();
        inst.printForEach();
        inst.printWh();
    }

    // Вывод на экран FOR
    void printFor() {
        for (int i = 0; i < week.length; i++) {
            System.out.print(week[i]);
        }
        System.out.println();

    }

    // Вывод на экран FOR Each
    void printForEach() {
        for (String s : week) System.out.print(s);
        System.out.println();
    }

    // Вывод на экран While
    void printWh() {
        int i = 0;
        while (i < week.length) {
            System.out.print(week[i++]);
        }
        System.out.println();
    }
}
