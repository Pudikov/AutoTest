package lesson8.task1;

import java.util.Objects;
import java.util.Random;

public class Person implements Comparable {
    String lastName;
    String firstName;

    public Person() {
        lastName = "Фамилия-" + (new Random().nextInt(20) + 1);
        firstName = "Имя-" + (new Random().nextInt(20) + 1);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (!Objects.equals(lastName, person.lastName)) return false;
        return Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() { return String.format("Фамилия: %s, Имя: %s", lastName, firstName); }

    @Override
    public int compareTo(Object obj) {
        Person other = (Person) obj;
        Integer first = Integer.parseInt(firstName.split("-")[1]);
        Integer second = Integer.parseInt(other.firstName.split("-")[1]);
        return first.compareTo(second);
    }
}
