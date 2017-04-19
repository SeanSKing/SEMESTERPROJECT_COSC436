/**
 * Created by JamieReed207 on 4/13/17.
 */
public class AddToCart implements Command {

    public AddToCart(StockList stockList, CartList cartList,int i){
        Item cart = stockList.getItemByIndex(i);
        cartList.addItem(cart);
    }

    public void execute() {

    }
}