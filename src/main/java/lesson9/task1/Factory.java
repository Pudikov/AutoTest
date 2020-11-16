package lesson9.task1;

import java.util.Random;

public class Factory {
    public static Car make() {
        int random = new Random().nextInt(101);
        if (random >= 0 & random < 40 )
            return new Renault();
        if(random >= 40 && random < 70)
            return new Nissan();
        if (random >= 70 && random <90)
            return new Mitsubishi();
        if(random >= 90 && random < 99)
            return new Mercedes();
        return null;
    }
}
