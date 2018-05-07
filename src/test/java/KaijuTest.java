import kaiju.Kaiju;
import kaiju.WalkingKaiju;
import org.junit.Before;
import org.junit.Test;
import vehicle.AerialVehicle;
import vehicle.HeavyTank;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    WalkingKaiju kaiju1;
    WalkingKaiju kaiju2;
    HeavyTank tank1;
    AerialVehicle aerial1;

    @Before
    public void before(){
        kaiju1 = new WalkingKaiju("Godzilla", 100, 10);
        kaiju2 = new WalkingKaiju("Anguirus", 80, 12);
        tank1 = new HeavyTank("Mitsubishi Heavy Industries", "Type 90 Tank", "battle tank", 50, "Lt Toho", "Japan", 20, 30);
        aerial1 = new AerialVehicle("Kawasaki", "OH-1", "scout helicopter", 10, 20, 50, 10, 20);
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

    @Test
    public void canAttackVehicle() {
        kaiju1.attack(tank1);
        assertEquals(40, tank1.getHealthValue());
    }

    @Test
    public void canMove() {
        assertEquals("Godzilla charges", kaiju1.move("charges"));
    }

    @Test
    public void canCharge(){
        assertEquals("Godzilla charges through ever obstacle!", kaiju1.charge());
    }

}
