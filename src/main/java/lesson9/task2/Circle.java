package lesson9.task2;

public class Circle implements Drawable {

    private Object Circle;

    @Override
    public void draw() {
        System.out.printf("Фигура %s нарисована", Circle);
    }
}
