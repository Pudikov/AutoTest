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
        Human[] grandFatMat = new Human[4];
        int i = 0;
        for (Human parent : elena.parents)
            for (Human grand : parent.parents)
                grandFatMat[i++] = grand;

        for (Human list : grandFatMat)
            if (list != null)
                System.out.printf("%s %d %n", list.name, list.age);


    }
}
