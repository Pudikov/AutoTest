package lesson5.task4;

import lesson5.task4.AgeTooHighException;
import lesson5.task4.AgeUnderZeroException;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age <= 0)
                throw new AgeUnderZeroException();
            if (age >= 20)
                throw new AgeTooHighException();
            {
                this.name = name;
                this.age = age;
            }

        } catch (AgeUnderZeroException auze) {

            System.out.println(auze.getStackTrace()[0]);
        }


    }


}
