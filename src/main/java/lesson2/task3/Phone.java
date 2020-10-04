package lesson2.task3;

public class Phone {
    public static void main(String[] args) {
        Phone inst = new Phone();
        String phone = "+7(912)632-10-64";
        inst.phoneCheck1(phone);
    }

    boolean phoneCheck1(String n) {
        boolean matches = n.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        System.out.println(matches);
        return matches;
    }
    boolean phoneCheck2(String n){
    if(!n.startsWith("+7("))
        return false;
        if (n.charAt(6) != ')')
            return false;
        if (n.charAt(10) != '-')
            return false;
        if (n.charAt(13) != '-')
            return false;
        if (n.length() != 16)
            return false;
        int[] ind = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        for (int index : ind) {
            if (!(n.charAt(index) >= '0' && n.charAt(index) <= '9'))
                return false;
        }
        return true;
    }
}
