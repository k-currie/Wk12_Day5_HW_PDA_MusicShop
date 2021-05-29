import behaviours.ISell;
import equipment.MusicStand;
import equipment.SheetMusic;
import equipment.StandType;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Keyboard;
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
    private Keyboard keyBoard1;
    private Guitar guitar1;
    private MusicStand musicStand1;
    private SheetMusic sheetMusic1;
    private ISell stockItem;

    @Before

    public void before(){
        shop = new Shop();
        saxophone1 = new Saxophone(InstrumentType.WIND, "Trevor James", "Alphasax", 349, 599, 9 );
        saxophone2 = new Saxophone(InstrumentType.WIND, "Sakkusu", "Alphasax", 399, 649, 9 );
        saxophone3 = new Saxophone(InstrumentType.WIND, "Buffet", "Soprano", 600, 850, 9 );
        keyBoard1 = new Keyboard(InstrumentType.KEYBOARD, "Roland", "Fantom-8", 2400.00, 3300.00, 1432);
        guitar1 = new Guitar(InstrumentType.STRING, "Fender", "Telecaster", 250.00, 399.00, 6, "black");
        musicStand1 = new MusicStand(35.00, 55.00, StandType.GUITAR_STAND);
        sheetMusic1 = new SheetMusic(6.00, 10,"Tunes for U","A Poser");
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

    @Test
    public void cannotRemoveItemFromStockIfItIsNotInStock() {
        shop.addToStock(saxophone1);
        shop.addToStock(saxophone2);
        shop.addToStock(saxophone3);
        shop.removeFromStock(keyBoard1);
        assertEquals(3, shop.getStockItemsCount());
    }

    @Test
    public void canFindInStockIfItemIsInStock() {
        shop.addToStock(saxophone1);
        shop.addToStock(saxophone2);
        assertEquals("This item is in stock", shop.getStockItem(saxophone1));
    }

    @Test
    public void cannotFindInStockIfItemIsNotInStock() {
        shop.addToStock(saxophone1);
        shop.addToStock(saxophone2);
        assertEquals("This item is not in stock", shop.getStockItem(saxophone3));
    }

    @Test
    public void canCalculateStockProfit() {
        shop.addToStock(saxophone1);
        shop.addToStock(keyBoard1);
        shop.addToStock(guitar1);
        shop.addToStock(musicStand1);
        shop.addToStock(sheetMusic1);
        assertEquals(1323.00, shop.calculateStockProfit(), 0.0);
    }
}
