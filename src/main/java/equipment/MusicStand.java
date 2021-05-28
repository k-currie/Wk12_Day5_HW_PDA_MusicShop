package equipment;

import behaviours.ISell;

import java.text.DecimalFormat;

public class MusicStand extends Equipment implements ISell {

    private StandType type;


    public MusicStand(double costPrice, double salePrice, StandType type) {
        super(costPrice, salePrice);
        this.type = type;
    }

    //GETTER
    public StandType getType() {
        return type;
    }

    // ISell method
    public double calculateMarkUp() {
        double sell = getSalePrice();
        double buy =  getCostPrice();
        double markUp = (sell - buy);
        return markUp;
    }

}
