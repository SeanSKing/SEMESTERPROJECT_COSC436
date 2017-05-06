/**
 * Created by JamieReed207 on 5/4/17.
 */
public class CMD_SignIn implements Command {
    private PreferenceUtil Pref;
    private TypeAbstract AT;


    CMD_SignIn(Aggregator agg, String name){
        Pref = PreferenceUtil.getInstance();
        UserFactory UF = new UserFactory();
        AT = UF.getUser(name);
    }

    public Object execute() {
        Pref.setUser(AT);
        return null;
    }
}
