package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Keyboard extends Instrument implements ISell, IPlay {

    private int length;

    public Keyboard(InstrumentType type, String make, String model, double costPrice, double salePrice, int length) {
        super(type, make, model, costPrice, salePrice);
        this.length = length;
    }

    //GETTER
    public int getLength() {
        return length;
    }

    //IPlay method
    public String play() {
        return "DUH DUH DUH DUUUHHHHH";
    }

    // ISell method
    public double calculateMarkUp() {
        double sell = getSalePrice();
        double buy =  getCostPrice();
        double markUp = (sell - buy);
        return markUp;
    }

}
