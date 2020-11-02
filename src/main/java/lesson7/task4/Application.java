package lesson7.task4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BaseCredit baseCredit = new BaseCredit();
        BaseCredit annuityCredit = new AnnuityCredit();
        BaseCredit differentiateCredit = new DifferentiateCredit();

        for (int i = 0; i < 12; i++) {

            System.out.printf("%d %s %s %s%n", baseCredit.month(), baseCredit.getMonthPayments().get(i), differentiateCredit.getMonthPayments().get(i), annuityCredit.getMonthPayments().get(i));
        }
      System.out.println(baseCredit.calculateOverpayment());
       System.out.println(annuityCredit.calculateOverpayment());
       System.out.println(differentiateCredit.calculateOverpayment());
    }
}
//%s %s%n