import equipment.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic1;

    @Before
    public void before(){
        sheetMusic1 = new SheetMusic(6.00, 10,"Tunes for U","A Poser");
    }

    @Test
    public void hasCostPrice() {
        assertEquals(6.00, sheetMusic1.getCostPrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(10.00, sheetMusic1.getSalePrice(), 0.0);
    }

    @Test
    public void hasTitle() {
        assertEquals("Tunes for U", sheetMusic1.getTitle());
    }

    @Test
    public void hasComposer() {
        assertEquals("A Poser", sheetMusic1.getComposer());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(4.00, sheetMusic1.calculateMarkUp(), 0.00);
    }
}
