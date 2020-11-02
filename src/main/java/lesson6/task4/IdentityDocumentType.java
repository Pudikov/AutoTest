package lesson6.task4;

import java.util.HashMap;
import java.util.Map;

public enum IdentityDocumentType {

    MILITARY_TICKED("07", "Военный билет"),

    DIPLOMATIC_PASSPORT("09", "Дипломатический паспорт"),

    FOREIGN_PASSPORT("10", "Паспорт иностранного гражданина"),

    PASSPORT_CITIZEN_RF("21", "Паспорт гражданина Российской Федерации"),

    RUSSIAN_CITIZEN_PASSPORT("22", "Загранпаспорт гражданина Российской Федерации");

    public String nameDocument;
    public String code;

    IdentityDocumentType(String code, String nameDocument) {
        this.code = code;
        this.nameDocument = nameDocument;

    }
}
