package lesson9.task2;

public class Table implements Movable {

    private Object Table;

    @Override
    public void move() {
        System.out.printf("Фигура %s нарисована", Table);
    }
}
