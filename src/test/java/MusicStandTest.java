import equipment.MusicStand;
import equipment.StandType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicStandTest {

    private MusicStand musicStand1;

    @Before
    public void before(){
        musicStand1 = new MusicStand(35.00, 55.00, StandType.GUITAR_STAND);
    }

    @Test
    public void hasCostPrice() {
        assertEquals(35.00, musicStand1.getCostPrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(55.00, musicStand1.getSalePrice(), 0.0);
    }

    @Test
    public void hasStandType() {
        assertEquals("GUITAR_STAND", musicStand1.getType().toString());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(20.00, musicStand1.calculateMarkUp(), 0.00);
    }
}
