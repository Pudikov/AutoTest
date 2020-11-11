package lesson8.task2;

import java.util.Random;

public class Person {
    int birthDate;
    Random random = new Random();

    public int randBirthDate() {
        birthDate = random.nextInt(365) + 1;
        return birthDate;
    }


}

