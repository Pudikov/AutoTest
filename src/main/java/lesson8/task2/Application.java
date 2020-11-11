package lesson8.task2;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
Person person = new Person();
        for (int persCount = 10; persCount < 31; persCount++){
            int duple=0;
            for (int j = 0; j < 100_000;j++ ){
                Set<Integer> persons = new HashSet<>();
                for (int k = 0; k < persCount; k++){
                    persons.add(person.randBirthDate());
                }
                if(persons.size() != persCount) duple++;
            }
            double duplic = (100.0f * duple) / 100_000;
            System.out.printf("%d: %.2f %%%n", persCount, duplic);
        }
    }
}
