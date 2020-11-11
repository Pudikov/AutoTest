package lesson8.task3;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String adress) {
        super(adress);
        ownerFirm = OwnerFirm.ELEKSNET;
        commission = 11;
        maxSum = 300;
    }
}
