 /**
 * Created by JamieReed207 on 4/23/17.
 */
public class Aggregator {
    private PreferenceUtil UserPref = PreferenceUtil.getInstance();
    private StockList stockList = new StockList();
    private CartList cartList = new CartList();
    private listIterator ProductList;

    public Aggregator() {
        String [] newTag = { "camera", "electronics" };
        stockList.addItem(new Item("Camera", 20, "cool camera", 20, newTag));
        newTag = new String[]{"food","health"};
        stockList.addItem(new Item("Banana", 100, "yellow Banana", 10, newTag));
        newTag = new String[]{"electronics","fitness","health"};
        stockList.addItem(new Item("fitbit", 20, "activity tracker", 120,newTag));
        newTag = new String[]{"electronics"};
        stockList.addItem(new Item("Garmin", 20, "never get lost again", 80,newTag));
        newTag = new String[]{"food","fitness","health"};
        stockList.addItem(new Item("Protein", 20, "cool camera", 20,newTag));
        newTag = new String[]{"health"};
        stockList.addItem(new Item("toothbrush", 20, "brush your teeth kids", 20,newTag));}

    public PreferenceUtil getUserPref(){
        return UserPref;
    }

    public StockList getStockList(){
        return stockList;
    }

    public CartList getCartList(){
        return cartList;
    }

    public void setIteratorLsit(listIterator list){
        ProductList = list;
    }

    public listIterator getIteratorList(){
        return ProductList;
    }


}