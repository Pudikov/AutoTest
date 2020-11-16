package lesson9.task1;

import lesson7.task1.MyArrayList;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Car> cars = new MyArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cars.add(Factory.make());
        }
        int countMercedes = 0;
        int countMitsubishi = 0;
        int countNissan = 0;
        int countRenault = 0;
        int countPremium = 0;
        int countRegular = 0;

        for (Car i : cars) {
            if (i instanceof Mercedes)
                countMercedes++;
            if (i instanceof Mitsubishi)
                countMitsubishi++;
            if (i instanceof Nissan)
                countNissan++;
            if (i instanceof Renault)
                countRenault++;
            if (i instanceof Premium)
                countPremium++;
            if (i instanceof Regular)
                countRegular++;
        }
        System.out.println( "Mercedes "+countMercedes);
        System.out.println("Mitsubishi "+countMitsubishi);
        System.out.println("Nissan "+countNissan);
        System.out.println("Renault "+countRenault);
        System.out.println("Premium "+countPremium);
        System.out.println("Regular "+countRegular);


    }
}
