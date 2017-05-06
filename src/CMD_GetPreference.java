 /**
 * Created by JamieReed207 on 4/25/17.
 */
public class CMD_GetPreference implements Command{
    private PreferenceUtil userPref;

    public Object execute() {
        Object prefObj = userPref.getAccount();
        return prefObj;
    }

    public CMD_GetPreference(Aggregator agg){
        userPref = agg.getUserPref();
    }
}
