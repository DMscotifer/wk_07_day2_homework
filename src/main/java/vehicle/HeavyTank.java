package vehicle;
import vehicle.Vehicle;

public class HeavyTank extends Vehicle {

    private String commander;
    private String nation;

    public HeavyTank(String make, String model, String type, int healthValue, String commander, String nation) {
        super(make, model, type, healthValue);
        this.commander = commander;
        this.nation = nation;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

}
