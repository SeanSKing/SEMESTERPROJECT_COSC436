/**
 * Created by JamieReed207 on 4/23/17.
 */
public class Aggregator {
    private PreferenceUtil UserPref = PreferenceUtil.getInstance();
    private StockList stockList = new StockList();
    private CartList cartList = new CartList();

    public Aggregator() {}

    public PreferenceUtil getUserPref(){
        return UserPref;
    }

    public StockList getStockList(){
        return stockList;
    }

    public CartList getCartList(){
        return cartList;
    }


}