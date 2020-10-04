package lesson4.task1;

import java.text.ParseException;

public class Application {
    public static void main(String[] args) throws ParseException {

        Human human = new Human();
        human.setLastName("Ив");
       // human.getPrint();
        System.out.println(human.getLastName());
        human.setFirstName("Ив");
        System.out.println(human.getFirstName());
       // human.setBirthDate(01.05.1980);
        System.out.println(human.getBirthDate());
     //   human.getFirstName();
     //   human.getLastName();



    }

    }

