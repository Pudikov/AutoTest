package lesson1.task6;

public class Abd {
    public static void main(String[] args) {
    Abd inst = new Abd();
    System.out.println(inst.schema(false,false,false,false));
    System.out.println(inst.schema(true,true,true,true));
    System.out.println(inst.schema(false,true,false,true));
    System.out.println(inst.schema(true,false,true,false));
    System.out.println(inst.schema(true,true,false,false));

    }
    boolean schema (boolean a, boolean b, boolean c, boolean d){
        return (a && b) && !(c || d);
    }
}
