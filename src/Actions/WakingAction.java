package Actions;

/**
 * Created by Irindul on 28/09/16.
 * Contains every common method of the Actions.
 */
public class WakingAction {

    private boolean toActivate;

    public WakingAction(){
        this.toActivate=true;
    }

    public void toggle(){
        this.toActivate = !this.toActivate;
    }

    public void activate(){
        this.toggle();
    }

    public boolean isActivate() {
        return toActivate;
    }
}
