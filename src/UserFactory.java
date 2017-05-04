import java.util.ArrayList;

/**
 * Created by JamieReed207 on 5/4/17.
 */
public class UserFactory {
    private ArrayList<AbstractType> UserList = new ArrayList<AbstractType>();

    public UserFactory(){
        UserList.add(new UserType("Jamie", true));
        UserList.add(new UserType("Sean", false));
        UserList.add(new UserType("Ryan", true));
    }

    public AbstractType getUser(String name){
        for (int i = 0; i < UserList.size(); i++) {
            if (UserList.get(i).getName().equalsIgnoreCase(name)){
                return UserList.get(i);
            }
        }
        return new NullType();
    }
}

