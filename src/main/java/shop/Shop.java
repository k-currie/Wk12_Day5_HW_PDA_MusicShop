package shop;

import behaviours.ISell;
import instruments.Saxophone;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockItemsCount() {
        return stock.size();
    }

    public void addToStock(ISell stockItem) {
        stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem) {
        stock.remove(stockItem);
    }
}
