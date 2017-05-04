 /**
 * Created by JamieReed207 on 4/23/17.
 */
public class PreferenceUtil {
    private static PreferenceUtil ourInstance = new PreferenceUtil();
    private AbstractType user;


    public static PreferenceUtil getInstance() {
        return ourInstance;
    }

   public void setUser(AbstractType newUser){
       this.user = newUser;
   }

     public AbstractType getAccount(){
         return user;
     }

     public String getUser(){
         return user.getName();
     }

     public Boolean getPrime(){
         return user.isPrime();
     }


}
