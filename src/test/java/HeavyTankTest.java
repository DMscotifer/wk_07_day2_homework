import kaiju.Kaiju;
import org.junit.Before;
import org.junit.Test;
import vehicle.AerialVehicle;
import vehicle.HeavyTank;

import java.awt.geom.Area;

import static org.junit.Assert.assertEquals;

public class HeavyTankTest {

    Kaiju kaiju1;
    Kaiju kaiju2;
    HeavyTank tank1;
    AerialVehicle aerial1;

    @Before
    public void before(){
        kaiju1 = new Kaiju("Godzilla", 100, 10);
        kaiju2 = new Kaiju("Anguirus", 80, 12);
        tank1 = new HeavyTank("Mitsubishi Heavy Industries", "Type 90 Tank", "battle tank", 50, "Lt Toho", "Japan", 20, 30);
        aerial1 = new AerialVehicle("Kawasaki", "OH-1", "scout helicopter", 10, 20, 50, 10, 20);
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
