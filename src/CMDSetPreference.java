/**
 * Created by JamieReed207 on 4/24/17.
 */
public class CMDSetPreference implements Command {
    public CMDSetPreference(Aggregator agg, String FirstName, String LastName,
                            String Address, String City, String State,
                            String Country, boolean isPrime){
        PreferenceUtil pref = agg.getUserPref();
        pref.setFirstName(FirstName);
        pref.setLastName(LastName);
        pref.setAddress(Address);
        pref.setCity(City);
        pref.setState(State);
        pref.setCountry(Country);
        pref.setIsPrime(isPrime);

    }
    public void execute() {}
}
