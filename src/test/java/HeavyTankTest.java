import org.junit.Before;
import org.junit.Test;
import vehicle.HeavyTank;

import static org.junit.Assert.assertEquals;

public class HeavyTankTest {

    HeavyTank tank1;

    @Before
    public void before(){
        tank1 = new HeavyTank("Mitsubishi Heavy Industries", "Type 90 Tank", "battle tank", 50, "Lt Toho", "Japan");
    }

    @Test
    public void getMake() {
        assertEquals("Mitsubishi Heavy Industries", tank1.getMake());
    }

    @Test
    public void getModel() {
        assertEquals("Type 90 Tank", tank1.getModel());
    }

    @Test
    public void getType() {
        assertEquals("battle tank", tank1.getType());
    }

    @Test
    public void getCommander() {
        assertEquals("Lt Toho", tank1.getCommander());
    }

    @Test
    public void getNation() {
        assertEquals("Japan", tank1.getNation());
    }
}
