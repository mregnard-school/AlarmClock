package Watch;

import Actions.WakingAction;

/**
 * Created by Eriwyr on 28/09/16.
 * AlarmClock with basic functionalities. Can have multiple action.
 * */

public class AlarmClock extends Clock {

    private int[] wakeUpTime;
    private boolean toActivate;
    private WakingAction[] wakingActions;



    public AlarmClock(WakingAction[] wakingActions){
        super();
        wakeUpTime= new int[2];
        toActivate=false;
        this.wakingActions = wakingActions;
    }

    public void toggle(){
        this.toActivate= !this.toActivate;
    }

    private void activate(){
        for (WakingAction wakingAction : wakingActions)
            if (wakingAction.isActivate()) {
                wakingAction.activate();  //Activate every action that must be activated.

            }
    }

    public void setWakeUpMinute(int minute){
        this.wakeUpTime[0]=minute;
    }


    public void setWakeUpHours(int hour){
        this.wakeUpTime[1]=hour;
    }

    @Override
    public void increment(){
        super.increment();
        if(this.wakeUpTime[0]==this.getMinutes() && this.wakeUpTime[1]==this.getHour()) //We only add a checking, if the current time equals the time to wake up
            this.activate(); //We activate the actions.
    }


}
