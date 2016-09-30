package Actions;

import Watch.AlarmClock;

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

    public void activate() {
        super.activate();
        if(toSnooze){

        }
        //récupere action snooze

    }
}
