package lesson6.task2;

import lesson6.task2.generators.AgeGenerator;
import lesson6.task2.generators.HumanGenerator;
import lesson6.task2.generators.NameGenerator;
import lesson6.task2.generators.PhoneGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        Set<Human> set = new HashSet<>();
        for (int i = 0; i < 2000; i++)
            set.add(HumanGenerator.generate());

        Iterator<Human> iterator = set.iterator();
        while (iterator.hasNext()) {
            Set<PhoneType> phoneTypes = iterator.next().phone.keySet();
            if (phoneTypes.contains(PhoneType.HOME)|| phoneTypes.contains(PhoneType.MOBIL)||phoneTypes.contains(PhoneType.WORK))
                iterator.remove();
        }
        System.out.println("Удалено: " + set.size());
    }
}
