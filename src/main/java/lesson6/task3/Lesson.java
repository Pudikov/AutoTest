package lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATH("Математика"),
    PHYSICS("Физика"),
    PROGRAMMING("Программирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    Random random = new Random();
    int length = random.nextInt(2) + 4;

    private final String name;

  /*  public String getName() {
        return name;
    }
      */
    Lesson(String name) {
        this.name = name;
    }

    List<Lesson> lessons = new ArrayList<>();

    public List<Lesson> generatorLesson() {
        for (int i = 0; i < length; i++) {
            lessons.add(values()[new Random().nextInt(values().length)]);
           // lessons.get(Integer.parseInt(getName()));
        }
        return lessons;
    }
}

