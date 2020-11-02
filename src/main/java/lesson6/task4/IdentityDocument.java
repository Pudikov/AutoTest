package lesson6.task4;

import java.util.Random;

public class IdentityDocument {

    public IdentityDocumentType documentType;
    public String seriesNumber;
    static Random rand = new Random();

    public IdentityDocument(IdentityDocumentType documentType, String seriesNumber) {
        this.documentType = documentType;
        this.seriesNumber = seriesNumber;

    }

    static IdentityDocument random() {
        IdentityDocumentType documentType = IdentityDocumentType.values()[new Random().nextInt(IdentityDocumentType.values().length)];
        String seriesNumber = rand.toString();
        return random();
    }

}
