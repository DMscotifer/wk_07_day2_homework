import org.junit.Before;
import org.junit.Test;
import vehicle.AerialVehicle;

import static org.junit.Assert.assertEquals;

public class AerialVehicleTest {

    AerialVehicle aerial1;

    @Before
    public void before(){
        aerial1 = new AerialVehicle("Kawasaki", "OH-1", "scout helicopter", 10, 20, 50);
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
