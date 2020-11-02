package lesson7.task1;

public class Application {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        System.out.println(list.get(-1));
        System.out.println(list.size());
        System.out.println(list.contains(6));
        list.add(0, 4);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
