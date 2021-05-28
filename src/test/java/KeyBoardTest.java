import instruments.InstrumentType;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

import static org.junit.Assert.assertEquals;

public class KeyBoardTest {

    private Keyboard keyBoard1;

    @Before
    public void before(){
        keyBoard1 = new Keyboard(InstrumentType.KEYBOARD, "Roland", "Fantom-8", 2400.00, 3300.00, 1432);
    }

    @Test
    public void hasInstrumentType() {
        assertEquals("KEYBOARD", keyBoard1.getType().toString());
    }
    @Test
    public void hasMake() {
        assertEquals("Roland", keyBoard1.getMake());
    }
    @Test
    public void hasModel() {
        assertEquals("Fantom-8", keyBoard1.getModel());
    }
    @Test
    public void hasCostPrice() {
        assertEquals(2400.00, keyBoard1.getCostPrice(), 0.0);
    }
    @Test
    public void hasSalePrice() {
        assertEquals(3300.00, keyBoard1.getSalePrice(), 0.0);
    }
    @Test
    public void hasLength() {
        assertEquals(1432, keyBoard1.getLength());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(900.00, keyBoard1.calculateMarkUp(), 0.00);
    }

    @Test
    public void canPlay() {
        assertEquals("DUH DUH DUH DUUUHHHHH", keyBoard1.play());
    }

}
