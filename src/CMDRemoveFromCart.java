/**
 * Created by JamieReed207 on 4/17/17.
 */
public class CMDRemoveFromCart implements Command {

    public CMDRemoveFromCart(CartList cartList, int i){
        cartList.removeItem(i);
    }

    public void execute(){}
}
