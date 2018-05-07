package vehicle;

public abstract class Vehicle {

    private String make;
    private String model;
    private String type;
    private int healthValue;

    public Vehicle(String make, String model, String type, int healthValue) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
