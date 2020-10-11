package lesson4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");


    public Human() {
    }


    public void setLastName(String lastName) {
        if (Pattern.matches("[А-Я][а-я]{2,}", lastName)) {
            this.lastName = lastName;
            setCorrectPrintLast(lastName);
        } else
            setIncorrectPrintLast(lastName);

    }

    public void setFirstName(String firstName) {

        if (Pattern.matches("[А-Я][а-я]{2,}", firstName)) {
            this.firstName = firstName;
            setCorrectPrintFirst(firstName);
        } else setIncorrectPrintFirst(firstName);

    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrintBirth(simpleDateFormat.format(birthDate));
        } else setIncorrectPrintBirth(simpleDateFormat.format(birthDate));
    }

    public void getPrintFirst(String string) {
        System.out.printf("Получение значения фамилии: %s%n", string);
    }

    public void getPrintLast(String string) {
        System.out.printf("Получение значения имени: %s%n", string);
    }

    public void getPrintBirth(String string) {
        System.out.printf("Получение значения дня рождения: %s%n", string);
    }

    public String getLastName() {
        getPrintLast(lastName);
        return lastName;
    }

    public String getFirstName() {
        getPrintFirst(firstName);
        return firstName;
    }

    public Date getBirthDate() {
        getPrintBirth(simpleDateFormat.format(birthDate));
        return birthDate;
    }

    public void setCorrectPrintFirst(String string) {
        System.out.printf("Установлено корректное значения: %s%n", string);

    }

    public void setCorrectPrintLast(String string) {
        System.out.printf("Установлено корректное значения: %s%n", string);
    }

    public void setCorrectPrintBirth(String string) {
        System.out.printf("Установлено корректное значения: %s%n", string);
    }

    public void setIncorrectPrintFirst(String string) {
        System.out.printf("Введенное значение некорректно: %s%n", string);
    }

    public void setIncorrectPrintLast(String string) {
        System.out.printf("Введенное значение некорректно: %s%n", string);
    }

    public void setIncorrectPrintBirth(String string) {
        System.out.printf("Введенное значение некорректно: %s%n", string);
    }
}
