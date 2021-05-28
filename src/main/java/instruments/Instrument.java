package instruments;

public abstract class Instrument {

    private InstrumentType type;
    private String make;
    private String model;
    private double costPrice;
    private double salePrice;

    public Instrument(InstrumentType type, String make, String model, double costPrice, double salePrice) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }


    //GETTERS
    public InstrumentType getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
