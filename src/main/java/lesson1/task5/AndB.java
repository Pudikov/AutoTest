package lesson1.task5;

public class AndB {
    public static void main(String[] args) {
    AndB inst = new AndB();
    System.out.println(inst.trFal(false,false));
    System.out.println(inst.trFal(false,true));
    System.out.println(inst.trFal(true,false));
    System.out.println(inst.trFal(true,true));
    System.out.println(inst.falTr(false,false));
    System.out.println(inst.falTr(false,true));
    System.out.println(inst.falTr(true,false));
    System.out.println(inst.falTr(true,true));

    }
    // Выполняет логическое "или" и инвертирует
    boolean trFal (boolean a, boolean b){
        return !(a || b);
    }
    // Выполняет инвертацию и логическое "и"
    boolean falTr (boolean c, boolean d) {
        return !c && !d;
    }
}
