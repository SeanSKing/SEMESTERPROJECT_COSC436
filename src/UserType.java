/**
 * Created by JamieReed207 on 4/5/17.
 */


public class UserType extends AbstractType{
    private String name;
    private Boolean Prime;


    public UserType(String newName, Boolean newPrimeStatus){
        this.name = newName;
        this.Prime = newPrimeStatus;
    }

    public void setName(String newName){this.name = newName;}

    public String getName(){return name;}

    @Override
    public Boolean isPrime() {
        return Prime;
    }

    public void setPrime(Boolean newPrimeStatus){
        this.Prime = newPrimeStatus;
    }
}
