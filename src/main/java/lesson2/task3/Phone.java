package lesson2.task3;

public class Phone {
    public static void main(String[] args) {
        Phone inst = new Phone();
        String passport = "+7(912)632-10-64";
        inst.phoneTrFal(passport);
    }

    boolean phoneTrFal(String n) {
        boolean matches = n.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        System.out.println(matches);
        return matches;
    }
}
