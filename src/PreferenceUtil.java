/**
 * Created by JamieReed207 on 4/23/17.
 */
public class PreferenceUtil {
    private static PreferenceUtil ourInstance = new PreferenceUtil();
    private String FirstName;
    private String LastName;
    private String Address;
    private String City;
    private String State;
    private String Country;
    private boolean isPrime;


    public static PreferenceUtil getInstance() {
        return ourInstance;
    }

    private PreferenceUtil() {
    }

    public void setFirstName(String fName){
        FirstName = fName;
    }

    public String getFirstName(){
        return FirstName;
    }

    public void setLastName(String lName){
        LastName = lName;
    }

    public String getLastName(){
        return LastName;
    }

    public void setAddress(String address){
        Address = address;
    }


    public void setCity(String city){
        City = city;
    }


    public void setState(String state){
        State = state;
    }

    public void setCountry(String country){
        Country = country;
    }

    public void setIsPrime(Boolean prime){
        isPrime = prime;
    }

    public String getFullAddress(){
        return Address +" "+City+" "+State+" "+Country;
    }
}
