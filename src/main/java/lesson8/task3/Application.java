package lesson8.task3;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );

        for (Terminal terminal : terminals) {
            terminal.balanceReplenishment(50, "+7(910)000-0150");
            terminal.balanceReplenishment(150, "+7(910)000-0150");
            terminal.balanceReplenishment(300, "+7(910)000-0300");
            terminal.balanceReplenishment(450, "+7(910)000-0450");
            terminal.balanceReplenishment(600, "+7(910)000-0600");
            terminal.balanceReplenishment(800, "+7(910)000-0800");
            terminal.balanceReplenishment(1000, "+7(910)000-1000");
            terminal.balanceReplenishment(1500, "+7(910)000-1500");
            System.out.println();
        }


    }
}
