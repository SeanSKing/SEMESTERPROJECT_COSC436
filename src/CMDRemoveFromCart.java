 /**
 * Created by JamieReed207 on 4/17/17.
 */
public class CMDRemoveFromCart implements Command {
    private CartList cartList;
    private int indexNum;

    public CMDRemoveFromCart(CartList cart, int i){
        cartList = cart;
        indexNum = i;

    }

    public Object execute(){
        cartList.removeItem(indexNum);
        return null;
    }
}
