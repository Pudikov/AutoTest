package lesson8.task3;

public enum OwnerFirm {
    KIWI("ООО «Киви»"),
    ELEKSNET("ООО «Элекснет»"),
    TINKOFF("АО «Тинькофф»");

    private String name;

    OwnerFirm(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
