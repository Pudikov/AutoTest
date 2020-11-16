package lesson9.task2;

public class Square implements Drawable {

    private Object Square;

    @Override
    public void draw() {
        System.out.printf("Фигура %s нарисована", Square);
    }
}
