package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Saxophone extends Instrument implements IPlay {

    private int keys;

    public Saxophone(InstrumentType type, String make, String model, double costPrice, double salePrice, int keys) {
        super(type, make, model, costPrice, salePrice);
        this.keys = keys;
    }

    //GETTER
    public int getKeys() {
        return keys;
    }

    //IPlay method
    public String play() {
        return "Boop, boop, boop, booop";
    }

}
