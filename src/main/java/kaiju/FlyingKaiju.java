package kaiju;

import behaviours.Flyable;

public class FlyingKaiju extends Kaiju implements Flyable {

    public FlyingKaiju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String fly(){
        return this.getName() + " flies into the air!";
    }

    public String dive(){
        return this.getName() + " attacks from above!";
    }
}
