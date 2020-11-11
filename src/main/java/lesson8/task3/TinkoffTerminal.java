package lesson8.task3;

public class TinkoffTerminal extends Terminal {
      double minSum;
    public TinkoffTerminal(String adress) {
        super(adress);
        ownerFirm = OwnerFirm.TINKOFF;
        commission = 9;
        maxSum = 600;
        minSum = 100;
    }

    @Override
    public void balanceReplenishment(double balance, String phoneNumber){
        if(balance > minSum)
            super.balanceReplenishment(balance, phoneNumber);
        else
            System.out.printf("Минимальная сумма для пополнения - %.2f%n", balance);
    }
}
