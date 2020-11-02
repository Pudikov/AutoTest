package lesson7.task4;


import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    static double amount = 300_000d;
    static double rate = 16.9d;
    static int duration = 12;
    int month;
    double interestFree;
    static double P;

    public int month() {
        month++;
        return month;
    }

    public List<Double> getMonthPayments() {
        List<Double> graphic = new ArrayList();
            interestFree = amount / duration;
        for (int i = 0; i < duration; i++) {
            graphic.add(interestFree);
        }
        return graphic;
    }

    public double calculateOverpayment() {
      //  for (double amount =0d; amount < duration; amount++){
        P = (rate / 100) * amount * ((duration + 1) / 2);
       // }
        return P;
    }

}
