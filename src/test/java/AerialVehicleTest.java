import kaiju.Kaiju;
import org.junit.Before;
import org.junit.Test;
import vehicle.AerialVehicle;
import vehicle.HeavyTank;

import static org.junit.Assert.assertEquals;

public class AerialVehicleTest {

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
    public void getMaxFuel() {
        assertEquals(50, aerial1.getMaxFuel());
    }


    @Test
    public void hasFlightSpeed() {
        assertEquals(20, aerial1.getFlightSpeed());
    }
}
