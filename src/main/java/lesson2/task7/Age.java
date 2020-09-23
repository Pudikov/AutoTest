package lesson2.task7;

public class Age {
    public static void main(String[] args) {
        int[] m = {32, 52, 66, 82, 25, 44, 60, 75, 22, 119};
        for (int i : m)
            if (i >= 25 && i < 44)
                System.out.println("молодой возраст");
            else if (i >= 44 && i < 60)
                System.out.println("средний возраст");
            else if (i >= 60 && i < 75)
                System.out.println("пожилой возраст");
            else if (i >= 75 && i < 90)
                System.out.println("старческий возраст");
            else
                System.out.println("неизвестный возраст");
    }
}