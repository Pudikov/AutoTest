package lesson2.task1;

public class Friday {
    String [] week = {"Пятница ", "это ","лучшый ","день ","недели."};

    public static void main(String[] args) {
        Friday inst = new Friday();
        inst.printFor();
        inst.printForEech();
        inst.printWh();
    }
    char printFor () {
        for (int i = 0; i < week.length; i++) {
            System.out.print(week [i]);
        }
        System.out.println();
        return 0;
    }
    char printForEech () {
        int i =0;
        for (String string: week) {
            System.out.print(week[i]);
            i++;
        }
        System.out.println();
        return 0;
    }
    char printWh (){
        int i = 0;
        while (i<week.length){
            System.out.print(week[i++]);
        } System.out.println();
    return 0;}
}
