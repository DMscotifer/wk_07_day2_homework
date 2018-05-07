import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Kaiju kaiju1;
    Kaiju kaiju2;

    @Before
    public void before(){
        kaiju1 = new Kaiju("Godzilla", 100, 10);
        kaiju2 = new Kaiju("Anguirus", 80, 12);
    }

    @Test
    public void hasName() {
        assertEquals("Godzilla", kaiju1.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(80, kaiju2.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, kaiju1.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("[booming] ROAR!!!!...", kaiju1.roar());
    }
}
