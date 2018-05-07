package kaiju;

import behaviours.Walkable;

public class WalkingKaiju extends Kaiju implements Walkable{

    public WalkingKaiju(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String walk(){
        return this.getName() + " walks over buildings!";
    }

    public String stomp(){
        return this.getName() + " causes earthquakes in his wake!";
    }

    public String charge(){
        return this.getName() + " charges through ever obstacle!";
    }

}
