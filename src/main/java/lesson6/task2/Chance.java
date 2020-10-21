package lesson6.task2;

public class Chance {
    static boolean a;

    public static boolean calculateChance(int percent) {
        if (percent >= 20 && percent < 100)
            a = true;

        else
            a = false;

        return a;
    }
}


/* if (percent > 50 && percent < 100){
            a = true;
            System.out.println(true);}
        else if (percent <= 50 && percent > 0){
            a = false;
            System.out.println(false);}
        else
            System.out.println("Число должно входит в диапозон от 1 до 100");

      return a;*/