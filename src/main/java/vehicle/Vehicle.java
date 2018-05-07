package vehicle;
import kaiju.Kaiju;

public abstract class Vehicle {

    private String make;
    private String model;
    private String type;
    private int healthValue;
    private int heavyWeapon;
    private int lightWeapon;

    public Vehicle(String make, String model, String type, int healthValue, int lightWeapon, int heavyWeapon) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.healthValue = healthValue;
        this.heavyWeapon = heavyWeapon;
        this.lightWeapon = lightWeapon;
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

    public int getHeavyWeapon() {
        return heavyWeapon;
    }

    public void setHeavyWeapon(int heavyWeapon) {
        this.heavyWeapon = heavyWeapon;
    }

    public int getLightWeapon() {
        return lightWeapon;
    }

    public void setLightWeapon(int lightWeapon) {
        this.lightWeapon = lightWeapon;
    }

    public String lightWeaponAttack(Kaiju target){
        target.setHealthValue((target.getHealthValue()) - this.getLightWeapon());
        return this.getMake() + this.getType() + " attacked " + target.getName() + " with light weapons.";
    }

}
