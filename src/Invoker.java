/**
 * Created by JamieReed207 on 4/13/17.
 */
public class Invoker {
    private static Aggregator agg;

    public Invoker(Aggregator Agg){
        agg = Agg;
    }


    public void invoke(Command command){
        command.execute();
    }

    public void AddToCart(int i){
        Command add = new CMDAddToCart(agg,i);
        invoke(add);
    }

    public void GetAllStock(int i){
        Command getStock = new CMDIterator(agg.getStockList(),i);
        invoke(getStock);
    }

    public void GetAllCart(int i){
        Command getCart = new CMDIterator(agg.getCartList(),i);
        invoke(getCart);
    }

    public void GetTagStock(String tag){
        Command byTag = new CMDIterator(agg.getStockList(),tag);
        invoke(byTag);
    }


    public void AddToStock(){
        Command AddStock = new CMDAddToStock(agg);
        invoke(AddStock);
    }

    public void RemoveFromCart(int i){
        Command remove = new CMDRemoveFromCart(agg.getCartList(),i);
        invoke(remove);
    }

    public void SetPreferences(String FirstName, String LastName,
                               String Address, String City, String State,
                               String Country, boolean isPrime){
        Command addPref = new CMDSetPreference(agg, FirstName, LastName, Address, City, State, Country, isPrime);
        invoke(addPref);
    }


}