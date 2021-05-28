import behaviours.ISell;
import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Saxophone saxophone1;
    private Saxophone saxophone2;
    private Saxophone saxophone3;
    private ISell stockItem;

    @Before

    public void before(){
        shop = new Shop();
        saxophone1 = new Saxophone(InstrumentType.WIND, "Trevor James", "Alphasax1", 349, 599, 9 );
        saxophone2 = new Saxophone(InstrumentType.WIND, "Trevor James", "Alphasax2", 349, 599, 9 );
        saxophone3 = new Saxophone(InstrumentType.WIND, "Trevor James", "Alphasax3", 349, 599, 9 );
    }

    @Test
    public void hasStock() {
        assertEquals(0, shop.getStockItemsCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(saxophone1);
        assertEquals(1, shop.getStockItemsCount());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(saxophone1);
        shop.addToStock(saxophone2);
        shop.addToStock(saxophone3);
        shop.removeFromStock(saxophone1);
        assertEquals(2, shop.getStockItemsCount());
    }

//    @Test
//    public void canRemoveFromStock2() {
//        shop.addToStock(saxophone1);
//        shop.addToStock(saxophone2);
//        shop.addToStock(saxophone3);
//        shop.removeFromStock(saxophone1);
//        assertEquals(saxophone2, shop.getStock());
//    }
}
