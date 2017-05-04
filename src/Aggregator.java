 /**
 * Created by JamieReed207 on 4/23/17.
 */
public class Aggregator {
    private PreferenceUtil UserPref = PreferenceUtil.getInstance();
    private StockList stockList = new StockList();
    private CartList cartList = new CartList();
    private listIterator ProductList;

    public Aggregator() {
        String [] newTag = { "camera", "electronics" ,"all"};
        stockList.addItem(new Item("Camera", 5, "cool camera", 20, newTag));
        newTag = new String[]{"food","health","all"};
        stockList.addItem(new Item("Banana", 1, "yellow Banana", 10, newTag));
        newTag = new String[]{"electronics","fitness","health","all"};
        stockList.addItem(new Item("fitbit", 1, "activity tracker", 120,newTag));
        newTag = new String[]{"electronics","all"};
        stockList.addItem(new Item("Garmin", 3, "never get lost again", 80,newTag));
        newTag = new String[]{"food","fitness","health","all"};
        stockList.addItem(new Item("Protein", 6, "cool camera", 20,newTag));
        newTag = new String[]{"health","all"};
        stockList.addItem(new Item("toothbrush", 1, "brush your teeth kids", 20,newTag));
        newTag = new String[]{"sports","all"};
        stockList.addItem(new Item("Football", 1, "Go long", 13,newTag));
        newTag = new String[]{"pets","all","food"};
        stockList.addItem(new Item("Dog Fodd", 12, "Dogs need to eat too", 7,newTag));
        newTag = new String[]{"clothing","sports","all"};
        stockList.addItem(new Item("Orioles Hat", 2, "Let's Go O's", 15,newTag));
        newTag = new String[]{"cooking","all"};
        stockList.addItem(new Item("Non-Stick Skillet", 4, "Omolet are yummy", 20,newTag));
    }

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