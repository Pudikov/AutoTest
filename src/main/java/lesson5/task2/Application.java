package lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 3);
        Cat myrzik = new Cat("Мурзик", 4);
        Cat bumer = new Cat("Бумер", 5);
        Cat sharik = new Cat("Шарик", 6);

        Cat[] cats = new Cat[5];
        cats[0] = barsik;
        cats[1] = myrzik;
        cats[2] = null;
        cats[3] = bumer;
        cats[4] = sharik;
        try {
            for (Cat string : cats)
                System.out.printf("Имя: %s, Возраст: %d%n", string.name, string.age);
        } catch (NullPointerException npe) {

        }

    }
}
