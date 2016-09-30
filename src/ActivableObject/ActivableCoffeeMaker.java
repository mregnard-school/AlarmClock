package ActivableObject;

import Actions.ActionWithoutSnooze;
import WakingObject.CoffeeMaker;

/**
 * Created by Irindul on 01/01/15.
 * Wrapper of a coffee maker.
 */
public class ActivableCoffeeMaker extends ActionWithoutSnooze { // TODO: 30/09/2016 To change with generic class.
    private CoffeeMaker coffeeMaker;

    public ActivableCoffeeMaker() {
        coffeeMaker = new CoffeeMaker();
    }

    public void activate(){
        super.activate();
        coffeeMaker.coffee();
    }
}
