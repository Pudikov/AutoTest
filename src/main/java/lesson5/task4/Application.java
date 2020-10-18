package lesson5.task4;

import java.util.Random;

import lesson5.task4.AgeTooHighException;

public class Application {
    public static void main(String[] args) {

        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            int rand = rndMinMax(-50, 50);
            try {
                Cat cat = new Cat("Барсик", rand);
                cats[i] = cat;
            } catch (AgeTooHighException athe) {
                cats[i] = null;
                System.out.println("Слишком большой возраст для кота: " + rand);

            }

        }
        for (Cat cat1 : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cat1.name, cat1.age);

            } catch (NullPointerException npe) {
                System.out.println("Неверные данные");
            }


        }
    }

    public static int rndMinMax(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
