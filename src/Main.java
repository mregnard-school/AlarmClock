import Actions.WakingAction;
import ActivableObject.ActivableAlarm;
import ActivableObject.ActivableCoffeeMaker;
import ActivableObject.ActivableRadio;
import Counter.CounterArray;
import Watch.AlarmClock;
import Watch.Clock;

/**
 * Created by Irindul on 26/09/16.
 * Main of the program
 */
public class Main {

    public static void main(String[] args) {

        ActivableAlarm alarm = new ActivableAlarm();
        ActivableCoffeeMaker coffee = new ActivableCoffeeMaker();
        ActivableRadio radio = new ActivableRadio();

        WakingAction[] wa = new WakingAction[3];

        wa[0] = alarm;
        wa[1] = coffee;
        wa[2] = radio;
        AlarmClock alarmClock = new AlarmClock(wa);
        alarmClock.toggle();
        alarmClock.setWakeUpHours(0);
        alarmClock.setWakeUpMinute(1);

        alarmClock.clock();
        Clock clock = new Clock();
        clock.getSeconds();

    }




}
