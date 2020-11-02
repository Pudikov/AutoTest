package lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {
    double i;
    int n;
    double S;
    double K;
    double A;
    double i1;

    public static int pow(double a, int b) {
        return (int) Math.pow(a, b);
    }

    @Override
    public List<Double> getMonthPayments() {
        List<Double> graphic = new ArrayList();
        i = rate / duration;
        n = 12;
        S = amount;
        i1 = (1 + i);
        K = (i * pow(i1, n)) / (pow(i1, n) - 1);
        A = K * S;

             for (int i = 0; i < duration; i++) {
                graphic.add(A);
          }
        return graphic;
    }
}
