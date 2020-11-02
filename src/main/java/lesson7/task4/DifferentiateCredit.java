package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    static double perPay;
    static double curPay;


    @Override
    public List<Double> getMonthPayments() {
        List<Double> graphic = new ArrayList();
        for (int i = 0; i < duration; i++) {
            perPay = amount * rate / 100 / 12;
            curPay = amount / duration + perPay;
            amount = amount - (curPay - perPay);
            graphic.add(curPay);
        }
        return graphic;
    }
}
