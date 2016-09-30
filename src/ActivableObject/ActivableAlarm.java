package ActivableObject;

import Actions.ActionSnooze;
import WakingObject.Alarm;

/**
 * Created by Irindul on 01/01/15.
 * Contains an alarm and wrap it.
 */
public class ActivableAlarm extends ActionSnooze { // TODO: 30/09/2016 change with generic class.
    private Alarm alarm;

    public ActivableAlarm() {
        alarm = new Alarm();
    }

    @Override
    public void activate(){
        super.activate();
        alarm.ring();
    }
}
