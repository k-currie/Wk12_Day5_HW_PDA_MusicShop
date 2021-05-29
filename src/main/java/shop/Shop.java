package shop;

import behaviours.ISell;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    //GETTER
    public ArrayList<ISell> getStock() {
        return stock;
    }


    //OTHER METHODS
    public int getStockItemsCount() {
        return stock.size();
    }

    public void addToStock(ISell stockItem) {
        stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem) {
        stock.remove(stockItem);
    }

    public String getStockItem(ISell stockItem) {
        if (stock.contains(stockItem)) {
            return "This item is in stock";
        }
        return "This item is not in stock";
    }
}
