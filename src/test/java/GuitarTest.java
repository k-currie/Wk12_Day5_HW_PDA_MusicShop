import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar1;
    InstrumentType instrumentType;

    @Before
    public void before(){
        guitar1 = new Guitar(InstrumentType.STRING, "Fender", "Telecaster", 250.00, 399.00, 6, "black");
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("STRING", guitar1.getType().toString());
    }
    @Test
    public void hasMake() {
        assertEquals("Fender", guitar1.getMake());
    }
    @Test
    public void hasModel() {
        assertEquals("Telecaster", guitar1.getModel());
    }
    @Test
    public void hasCostPrice() {
        assertEquals(250.00, guitar1.getCostPrice(), 0.0);
    }
    @Test
    public void hasSalePrice() {
        assertEquals(399.00, guitar1.getSalePrice(), 0.0);
    }
    @Test
    public void hasNumberOfStrings() {
        assertEquals(6, guitar1.getStrings());
    }
    @Test
    public void hasColour() {
        assertEquals("black", guitar1.getColour());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(149.00, guitar1.calculateMarkUp(), 0.00);
    }

    @Test
    public void canPlay() {
        assertEquals("Twang, twang", guitar1.play());
    }
}
