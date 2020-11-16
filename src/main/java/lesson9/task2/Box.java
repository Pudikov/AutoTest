package lesson9.task2;

public class Box implements Movable {

    private Object Box;

    @Override
    public void move() {
        System.out.printf("Фигура %s нарисована", Box);
    }
}
