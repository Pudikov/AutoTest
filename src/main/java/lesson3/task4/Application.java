package lesson3.task4;

public class Application {


    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human michail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human aleksandr = new Human("Александр");
        Human valeriy = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human grigoriy = new Human("Григорий");
// создание связей
        sergey.addFriends(valeriy);
        sergey.addFriends(grigoriy);
        stanislav.addFriends(valeriy);
        stanislav.addFriends(michail);
        egor.addFriends(aleksandr);
        egor.addFriends(grigoriy);
        aleksandr.addFriends(grigoriy);
        aleksandr.addFriends(michail);
        michail.addFriends(stanislav);
        michail.addFriends(aleksandr);

        System.out.println(isAlFr(sergey, grigoriy));
        System.out.println(isAlFr(sergey, aleksandr));
        System.out.println(isAlFr(stanislav, michail));
        System.out.println(isAlFr(michail, valeriy));

    }
// метод для проверки связей


    static boolean isAlFr(Human name1, Human name2) {
        for (Human human : name1.friends)
            if (human == name2) return true;
        return false;


    }
}
