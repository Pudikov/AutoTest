package lesson2.task1;

public class Friday {
    String [] week = {"Пятница ", "это ","лучшый ","день ","недели."};

    public static void main(String[] args) {
        Friday inst = new Friday();
        inst.printFor();
        inst.printForEach();
        inst.printWh();
    }
    // Вывод на экран FOR
    char printFor () {
        for (int i = 0; i < week.length; i++) {
            System.out.print(week [i]);
        }
        System.out.println();
        return 0;
    }
    // Вывод на экран FOR Each
    char printForEach () {
        int i=0;
        for (String s:week) {System.out.print(week[i]);
        i++;
        }
        System.out.println();
        return 0;
    }
    // Вывод на экран While
    char printWh (){
        int i = 0;
        while (i<week.length){
            System.out.print(week[i++]);
        } System.out.println();
    return 0;}
}
