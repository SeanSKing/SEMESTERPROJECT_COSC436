 /**
 * Created by JamieReed207 on 4/25/17.
 */
public class CMDGetPreference implements Command{
    private PreferenceUtil userPref;

    public Object execute() {
        Object prefObj = userPref.getAccount();
        return prefObj;
    }

    public CMDGetPreference(Aggregator agg){
        userPref = agg.getUserPref();
    }
}
