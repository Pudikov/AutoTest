package lesson3.task2;

import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(2, 5, "Барсик"), new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"), new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")};
        String[] name = {cats[0].name, cats[1].name, cats[2].name, cats[3].name, cats[4].name,};
        Arrays.sort(name);

        // for (int i = 0; i < name.length; i++)
        //  System.out.println(sortName);
        for (String sortName : name) {
            for (Cat cat : cats) {
                if (cat.name.equals(sortName))
                    System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", cat.name, cat.age, cat.weight);
            }
        }

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                if (cats[j].name.equals(name[i]))
                    System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", cats[j].name, cats[j].age, cats[j].weight);
            }
        }


    }

}
