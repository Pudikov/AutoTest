package lesson4.task2;

import lesson4.task1.Human;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        Human[] humans = new Human[3];
        int index = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        while (true) {


            Validator.formatString(string);

            Validator.arraySpace(string);

            String[] world = string.split(" ");
            Human human = new Human();
            human.setLastName(world[0]);
            human.setFirstName(world[1]);
            human.setBirthDate(sdf.parse(world[2]));
            Validator.validHuman(human);

            humans[index++] = human;
            if (Validator.validArray(humans))
                break;

        }
    }
}
