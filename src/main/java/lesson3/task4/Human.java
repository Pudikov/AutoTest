package lesson3.task4;

import java.util.Arrays;

public class Human {
    String name;
    Human[] friends;

    Human(String name) {
        this.name = name;
    }

    //  Добовления друга
    void addFriends(Human addHuman) {
        if (friends == null) // проверка что  пустой
            friends = new Human[1]; // инициализация массива
        else {
            friends = Arrays.copyOf(friends, friends.length + 1); // копирование массива
        }
        friends[friends.length - 1] = addHuman; // добовление элемента


    }
}