package lesson6.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        PhoneGenerator phoneGenerator = new PhoneGenerator();
        NameGenerator nameGenerator = new NameGenerator();
        AgeGenerator ageGenerator = new AgeGenerator();

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String lastName = nameGenerator.generate();
            String firstName = nameGenerator.generate();
            int age = ageGenerator.generate();
            String numberPhone = phoneGenerator.generate();
            Human human = new Human(lastName, firstName, age, numberPhone);
            humans.add(human);
        }
        for (Human human : humans) {
              if (ageGenerator.generate() == 35)
            System.out.printf("Фамилия %s,Имя %s, возраст %d, тел. %s%n", human.firstName, human.lastName, human.age, human.numberPhone);
        }
    }
}
