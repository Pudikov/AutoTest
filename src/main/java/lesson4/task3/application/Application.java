package lesson4.task3.application;

import lesson4.task3.workers.ServiceDesk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {

        ServiceDesk.createTicket("Прошу предоставить справку 2-ндфл за текущий год");
        ServiceDesk.createTicket("Прошу предоставить курьера 2 сентября 2020 года");
        ServiceDesk.createTicket("Необходимо починить принтер в комнате 207");
        ServiceDesk.createTicket("Прошу произвести внеплановую уборку в переговорной №1");
        ServiceDesk.createTicket("Прошу выдать канцелярские принадлежности сотруднику Баранову А.С.");
        ServiceDesk.createTicket("Прошу произвести внеплановую уборку в переговорной №1");
    }
}
