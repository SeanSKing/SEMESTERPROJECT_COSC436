/**
 * Created by JamieReed207 on 4/17/17.
 */
public class RemoveFromCart implements Command {

    public RemoveFromCart(CartList cartList,int i){
        cartList.removeItem(i);
    }

    public void execute(){}
}
