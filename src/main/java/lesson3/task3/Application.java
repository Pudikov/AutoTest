package lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human valery = new Human("Валерий", 60, null, null);
        Human aleksandra = new Human("Александра", 61, null, null);
        Human ivan = new Human("Иван", 62, null, null);
        Human sergey = new Human("Сергей", 39, valery, aleksandra);
        Human marina = new Human("марина", 38, ivan, null);
        Human vitaly = new Human("Виталий", 14, sergey, marina);
        Human elena = new Human("Елена", 12, sergey, marina);
        Human[] grandFathMathElena = new Human[4];
        int i = 0;
        for (Human parent : elena.parents)
            for (Human grand : parent.parents)
                grandFathMathElena[i++] = grand;
//Human[] grandFathMathElena = {elena.parents[0].parents[0],elena.parents[0].parents[1],elena.parents[1].parents[0]};
        for (Human list : grandFathMathElena)
            if (list != null)
                System.out.printf((list.name) + " " + (list.age) + "%n");
        // String[] grandFathMathElena = {valery.name, String.valueOf(valery.age), aleksandra.name, String.valueOf(aleksandra.age), ivan.name, String.valueOf(ivan.age)};
        //   int []  drandAge = {valery.age,aleksandra.age,ivan.age};
        // for (String strGrand : grandFathMathElena)
        //System.out.printf("Имя: %s, Возраст: %d%n", valery.name, valery.age);
        //System.out.printf("Имя: %s, Возраст: %d%n", aleksandra.name, aleksandra.age);
        //System.out.printf("Имя: %s, Возраст: %d%n", ivan.name, ivan.age);
        //System.out.println();

    }
}
