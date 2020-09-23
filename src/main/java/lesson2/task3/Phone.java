package lesson2.task3;

public class Phone {
    public static void main(String[] args) {
        Phone inst = new Phone();
        String passport = "1452 639452";
        inst.phoneTrFal(passport);
    }

    boolean phoneTrFal(String n) {
        boolean matches = n.matches("^(\\d{4} \\d{6})$");
        System.out.println(matches);
        return matches;
    }
}
