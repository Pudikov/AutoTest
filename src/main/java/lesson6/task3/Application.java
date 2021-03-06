package lesson6.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();

        // Массив расписания
        Map<DayOfWeek, List<Lesson>> diary = new HashMap<>();

        diary.put(DayOfWeek.MONDAY, Lesson.MATH.generatorLesson());
        diary.put(DayOfWeek.TUESDAY, Lesson.MATH.generatorLesson());
        diary.put(DayOfWeek.WEDNESDAY, Lesson.MATH.generatorLesson());
        diary.put(DayOfWeek.THURSDAY, Lesson.MATH.generatorLesson());
        diary.put(DayOfWeek.FRIDAY, Lesson.MATH.generatorLesson());

        scholar.diary();
        // Выводим на экран
        for (Map.Entry<DayOfWeek, List<Lesson>> entry : diary.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // Подсичать количество уроков
        Map<Lesson,Integer> countLesson = new HashMap<>();
        for (int i = 0;i < diary.size();i++ ){

            // Отсортировать по убыванию
        }

        //System.out.println(diary);
    }
}


