package lesson1.task2;

public class WidHeig {
     boolean x;
    public static void main(String[] args) {
    WidHeig inst = new WidHeig();
    System.out.println(inst.rectangle(2,7));
    System.out.println(inst.rectangle(6,5));
    System.out.println(inst.rectangle(6,3));

    }
    boolean rectangle (int width, int height) {
        int s = width * height;
        int p = 2 * width + 2 * height;
        if (s > p)
            x = true;
        else
            x = false;
        return x;
    }
}
