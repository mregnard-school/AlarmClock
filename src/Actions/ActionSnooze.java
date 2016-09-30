package Actions;

import Watch.Clock;

/**
 * Created by Irindul on 01/01/15.
 * Add Snooze handling.
 */
public abstract class ActionSnooze extends WakingAction {

    private boolean toSnooze;

    protected ActionSnooze() {
        this.toSnooze = true;
    }

    private void toogleSnooze(){
        this.toSnooze = !this.toSnooze;
    }

    @Override
    public void activate() {
        if(toSnooze){
            Clock.sleep(1000);
            this.toogleSnooze();
        } else {
            super.activate();
        }
        //récupere action snooze

    }
}
