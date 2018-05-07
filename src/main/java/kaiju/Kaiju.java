package kaiju;

import vehicle.Vehicle;

public class Kaiju {

    private String name;
    private int healthValue;
    private int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public String roar(){
        return "[booming] ROAR!!!!...";
    }

    public String attack(Vehicle target){
        target.setHealthValue((target.getHealthValue()) - this.getAttackValue());
        return this.getName() + " attacked " + target.getModel();
    }

    public String move(String movementType ){
        return this.getName() + " " + movementType;
    }

}
