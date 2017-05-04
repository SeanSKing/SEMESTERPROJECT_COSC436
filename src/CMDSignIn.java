/**
 * Created by JamieReed207 on 5/4/17.
 */
public class CMDSignIn implements Command {
    private PreferenceUtil Pref;
    private AbstractType AT;


    CMDSignIn(Aggregator agg, String name){
        Pref = PreferenceUtil.getInstance();
        UserFactory UF = new UserFactory();
        AT = UF.getUser(name);
    }

    public Object execute() {
        Pref.setUser(AT);
        System.out.print(AT.getName());
        return null;
    }
}
