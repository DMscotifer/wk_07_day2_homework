package vehicle;

public class AerialVehicle extends Vehicle {

    private int flightSpeed;
    private int maxFuel;
    private int remainingFuel;

    public AerialVehicle(String make, String model, String type, int healthValue, int flightSpeed, int maxFuel, int lightWeapon, int heavyWeapon) {
        super(make, model, type, healthValue, lightWeapon, heavyWeapon);
        this.flightSpeed = flightSpeed;
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }



}
