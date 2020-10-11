package lesson4.task3.workers;

public class ServiceDesk {
    private static int number = 0;

    public static void createTicket(String description) {
        number++;
        System.out.printf("Заявка %d была создана: %s%n", number, description);
        while (true) {
            {
                if (description.matches("((.*)(справк)(.*))|((.*)(отчет)(.*))|((.*)(бюджет)(.*))")) {
                    Accountant.takeTicket(number);
                    return;
                }


                if (description.matches("((.*)(доставк)(.*))|((.*)(курьер)(.*))")) {
                    Logistician.takeTicket(number);
                    return;
                }
                if (description.matches("((.*)(компьютер)(.*))|((.*)(принтер)(.*))|((.*)(сервер)(.*))")) {
                    SysAdmin.takeTicket(number);
                    return;

                }

                if (description.matches("((.*)(уборк)(.*))")) {
                    Cleaner.takeTicket(number);
                    return;
                }

            }

            System.out.printf("Специалист по выполнению заявки %d не найден%n", number);
            break;
        }

    }

}


// ˆ(.*)(справк)(.*)$   System.out.printf("Специалист по выполнению заявки %d не найден%n", number);