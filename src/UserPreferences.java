

/**
 * Created by JamieReed207 on 4/5/17.
 */


public class UserPreferences {
    private static UserPreferences ourInstance = new UserPreferences();
    private String name = "John Smith";
    private boolean supreme = false;
    private String prefered_currency = "US-Dollar $";

    public static UserPreferences getInstance() {
        return ourInstance;
    }

    private UserPreferences() {}

    public void setName(String newName){this.name = newName;}

    public String getName(){return name;}

    public void setSupreme(Boolean newSup){this.supreme = newSup;}

    public Boolean isSupreme(){
        return supreme;
    }

    public void setPrefered_currency(String currency){
        this.prefered_currency = currency;
    }

    public String getPrefered_currency(){
        return prefered_currency;
    }
}
