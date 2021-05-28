import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    private Saxophone saxophone1;

    @Before
    public void before(){
        saxophone1 = new Saxophone(InstrumentType.WIND, "Trevor James", "Alphasax", 349, 599, 9 );
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("WIND", saxophone1.getType().toString());
    }
    @Test
    public void hasMake() {
        assertEquals("Trevor James", saxophone1.getMake());
    }
    @Test
    public void hasModel() {
        assertEquals("Alphasax", saxophone1.getModel());
    }
    @Test
    public void hasCostPrice() {
        assertEquals(349, saxophone1.getCostPrice(), 0.0);
    }
    @Test
    public void hasSalePrice() {
        assertEquals(599.00, saxophone1.getSalePrice(), 0.0);
    }
    @Test
    public void hasNumberOfStrings() {
        assertEquals(9, saxophone1.getKeys());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(250.00, saxophone1.calculateMarkUp(), 0.00);
    }

    @Test
    public void canPlay() {
        assertEquals("Boop, boop, boop, booop", saxophone1.play());
    }

}
