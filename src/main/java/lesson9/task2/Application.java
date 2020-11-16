package lesson9.task2;

import lesson7.task1.MyArrayList;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> objects = new MyArrayList<>();
        for (int i = 0; i < 20; i++) {
            objects.add(Generator.generate());
        }
        for (Object object: objects) {
            Action.action(object);

        }

    }
}
