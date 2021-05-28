package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements ISell, IPlay {

    private int strings;
    private String colour;

    public Guitar(InstrumentType type, String make, String model, double costPrice, double salePrice, int strings, String colour) {
        super(type, make, model, costPrice, salePrice);
        this.strings = strings;
        this.colour = colour;
    }

    //GETTERS
    public int getStrings() {
        return strings;
    }

    public String getColour() {
        return colour;
    }

    //IPlay method
    public String play() {
        return "Twang, twang";
    }

    // ISell method
    public double calculateMarkUp() {
        double sell = getSalePrice();
        double buy =  getCostPrice();
        double markUp = (sell - buy);
        return markUp;
    }
}
