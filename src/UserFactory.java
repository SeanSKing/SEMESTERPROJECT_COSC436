import java.util.ArrayList;

/**
 * Created by JamieReed207 on 5/4/17.
 */
public class UserFactory {
    private ArrayList<TypeAbstract> UserList = new ArrayList<TypeAbstract>();

    public UserFactory(){
        UserList.add(new TypeUser("Jamie", true));
        UserList.add(new TypeUser("Sean", false));
        UserList.add(new TypeUser("Ryan", true));
    }

    public TypeAbstract getUser(String name){
        for (int i = 0; i < UserList.size(); i++) {
            if (UserList.get(i).getName().equalsIgnoreCase(name)){
                return UserList.get(i);
            }
        }
        return new TypeNull();
    }
}

