 /**
 * Created by JamieReed207 on 4/13/17.
 */
public class CMD_AddToCart implements Command {
    private CartList cartList;
    private Item item;

    public CMD_AddToCart(Aggregator agg, int i){
        cartList = agg.getCartList();
        item = agg.getStockList().getItemByIndex(i);
    }
    public CMD_AddToCart(Aggregator agg, Item item1) {
        cartList = agg.getCartList();
        item =item1;
    }

    public Object execute() {
        cartList.addItem(item);
        return null;
    }
}