package lesson1.task1;

public class Radius {
    public static void main(String[] args) {
        Radius inst = new Radius();
        System.out.println(inst.arcir(0));
        System.out.println(inst.arcir(2));
        System.out.println(inst.arcir(100));
    }
    // Метод для вычесления площади окружности
    double  arcir (int radius){
        double s = 3.14 * (radius*radius);
        return s;
    }

}
