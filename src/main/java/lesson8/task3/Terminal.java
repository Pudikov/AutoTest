package lesson8.task3;

public class Terminal implements TopUpBalance {
     String adress;
     OwnerFirm ownerFirm;
     int commission;
     int maxSum;

    @Override
    public void balanceReplenishment(double balance, String phoneNumber) {
        double pay;
        if (balance >= maxSum) {
            pay = balance;
        } else pay = balance * (1d - commission / 100);

        System.out.printf("Внесена сумма %f.2 для пополнения телефона %s. Баланс пополнен на сумму %f.2. С уважением, ваш %s%n",
                balance, phoneNumber, pay, ownerFirm.getName(), adress);
    }

    public Terminal(String adress) {
        this.adress = adress;
    }

}
