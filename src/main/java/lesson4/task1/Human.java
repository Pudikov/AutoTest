package lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    private String lastName;
    private String firstName;
    private String birthDate;
    private String print;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    private final Date date = new Date();
    private final Long millis = date.getTime();


    public Human() {
    }

    public void setCorrectPrint(String print) {
        this.print = print;
        System.out.print(print);
    }

    public void setIncorrectPrint(String print) {
        this.print = print;
        System.out.print(print);
    }

    public void setLastName(String lastName) {
        if (Pattern.matches("[А-Я][а-я]{2,}", lastName)) {
            this.lastName = lastName;
            setCorrectPrint("Получено значение фамилии: " + lastName);
        } else
            setIncorrectPrint("Введенное значение некорректно: " + lastName);

    }

    public void setFirstName(String firstName) {
        if (Pattern.matches("[А-Я][а-я]{2,}", firstName)) {
            this.firstName = firstName;
            setCorrectPrint("Получено значение имени: " + firstName);
        } else setIncorrectPrint("Введенное значение некорректно: " + firstName);

    }

    public Human setBirthDate(String birthDate) {

        this.birthDate = birthDate;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPrint() {
        return print;
    }


}

//  "[А-Я][а-я]{2,}"