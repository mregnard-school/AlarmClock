package ActivableObject;

import Actions.ActionSnooze;
import WakingObject.Radio;

/**
 * Created by Irindul on 29/09/16.
 * Wrapper of a Radio
 */
public class ActivableRadio extends ActionSnooze { // TODO: 30/09/2016 change with generic class.
    private Radio radio;

    public ActivableRadio() {
        radio = new Radio();
    }

    @Override
    public void activate(){
        super.activate();
        radio = new Radio(); //A refactor
        radio.listen();
    }

}
