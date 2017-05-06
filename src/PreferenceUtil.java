 /**
 * Created by JamieReed207 on 4/23/17.
 */
public class PreferenceUtil {
    private static PreferenceUtil ourInstance = new PreferenceUtil();
    private TypeAbstract user;


    public static PreferenceUtil getInstance() {
        return ourInstance;
    }

   public void setUser(TypeAbstract newUser){
       this.user = newUser;
   }

     public TypeAbstract getAccount(){
         return user;
     }

     public String getUser(){
         return user.getName();
     }

     public Boolean getPrime(){
         return user.isPrime();
     }


}
