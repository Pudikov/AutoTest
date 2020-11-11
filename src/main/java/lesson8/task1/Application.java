package lesson8.task1;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Person person = new Person();
            people.add(person);
        }

        Set<Person> uniPeople = new TreeSet<>();
        for (Person person : people) {
            for (Person otheParson : people) {
                if (person != otheParson && person.equals(otheParson)) ;
                uniPeople.add(person);
            }
        }
        Iterator<Person> iterator = uniPeople.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        Set<Person> people1 = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            Person person = new Person();
            people1.add(person);
        }

        System.out.println(people1.size());
    }
}
