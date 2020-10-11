package lesson4.task2;

import lesson4.task1.Human;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {


    public static String formatString(String valid) {

        if (valid.matches("(.+)\\s(.+)\\s(.+)")) {
            System.out.println("Соответсвует формату");
        } else System.out.println("Несоответсвует формату");
        return valid;
    }

    public static void arrayString(String valid) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String[] world = valid.split("\\s");
        for (String string : world)
            System.out.print(string + " ");
        System.out.println();

    }

    public static boolean validHuman(Human human) throws ParseException {

        boolean validHuman = human.getFirstName() != null && human.getLastName() != null && human.getBirthDate() != null;
        System.out.println(validHuman);
        return validHuman;

    }

    public static boolean validArray(Human[] array) throws ParseException {

        boolean notNull = true;
        for (Human human : array) {
            if (human == null) {
                notNull = false;
                break;
            }

        }
        System.out.println(notNull);
        return notNull;

    }

}

//("[A-Za-zА-Яа-я]+\\s[A-Za-zА-Яа-я]+\\s[A-Za-zА-Яа-я]+$");