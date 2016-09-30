package Actions;

import WakingObject.Alarm;
import Watch.AlarmClock;
import Watch.Clock;

/**
 * Created by Irindul on 01/01/15.
 * Add Snooze handling.
 */
public abstract class ActionSnooze extends WakingAction {

    private boolean toSnooze;

    public ActionSnooze() {
        this.toSnooze = true;
    }

    public void toogleSnooze(){
        this.toSnooze = !this.toSnooze;
    }

    @Override
    public void activate() {
        if(toSnooze){
            Clock.sleep(1000);
        } else {
            super.activate();
        }
        //récupere action snooze

    }
}
