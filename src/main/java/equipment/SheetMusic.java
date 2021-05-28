package equipment;

import behaviours.ISell;

public class SheetMusic extends Equipment implements ISell {

    private String title;
    private String composer;


    public SheetMusic(double costPrice, double salePrice, String title, String composer) {
        super(costPrice, salePrice);
        this.title = title;
        this.composer = composer;
    }


    //GETTERS
    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }


    // ISell method
    public double calculateMarkUp() {
        double sell = getSalePrice();
        double buy =  getCostPrice();
        double markUp = (sell - buy);
        return markUp;
    }

}
