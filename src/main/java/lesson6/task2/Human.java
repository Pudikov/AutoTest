package lesson6.task2;

import java.util.HashMap;
import java.util.Map;

public class Human {

    String lastName;
    String firstName;
    int age;
    Map<PhoneType, String> phone;

    public Human(String lastName, String firstName, int age, Map<PhoneType, String> phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phone = phone;

    }


}
