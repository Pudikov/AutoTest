package lesson3.task3;

public class Human {
    String name;
    int age;

    Human[] parents = new Human[2];

    public Human(String name, int age, Human father, Human mather) {
        this.name = name;
        this.age = age;
        this.parents[0] = father;
        this.parents[1] = mather;

    }
}
