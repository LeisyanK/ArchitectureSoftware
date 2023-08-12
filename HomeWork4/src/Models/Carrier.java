package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private List<Integer> zones;
    private long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;

        zones = new ArrayList<Integer>();
        zones.add(0);
        zones.add(1);
    }

    public long getId(){
        return id;
    }

    public long getCardNumber(){
        return cardNumber;
    }
}
