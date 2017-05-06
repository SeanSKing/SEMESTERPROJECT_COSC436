 /**
 * Created by JamieReed207 on 4/17/17.
 */
public class CMD_RemoveFromCart implements Command {
    private CartList cartList;
    private int indexNum;

    public CMD_RemoveFromCart(CartList cart, int i){
        cartList = cart;
        indexNum = i;

    }

    public Object execute(){
        cartList.removeItem(indexNum);
        return null;
    }
}
