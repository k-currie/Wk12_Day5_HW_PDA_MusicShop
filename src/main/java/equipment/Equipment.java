package equipment;

public abstract class Equipment {

    private double costPrice;
    private double salePrice;

    public Equipment(double costPrice, double salePrice) {
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    //GETTERS
    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

}
