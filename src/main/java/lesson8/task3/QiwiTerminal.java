package lesson8.task3;

public class QiwiTerminal extends Terminal{
    public QiwiTerminal(String adress) {
        super(adress);
        ownerFirm = OwnerFirm.KIWI;
        commission = 7;
        maxSum = 1000;
    }
}
