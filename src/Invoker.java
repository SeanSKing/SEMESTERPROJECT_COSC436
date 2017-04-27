 /**
 * Created by JamieReed207 on 4/13/17.
 */
public class Invoker {
    private static Aggregator agg;

    public Invoker(Aggregator Agg){
        agg = Agg;
    }


    public Object invoke(Command command){
         Object invokedObject = command.execute();
         return invokedObject;
    }

    public void AddToCart(int i){
        Command add = new CMDAddToCart(agg,i);
        invoke(add);
    }

     public void AddToCart(Item item){
         Command add = new CMDAddToCart(agg, item);
         invoke(add);
     }

    public Object GetAllStock(int i){
        Command getStock = new CMDIterator(agg,agg.getStockList(),i);
        Object x = invoke(getStock);
        return  x;
    }

    public Object GetAllCart(int i){
        Command getCart = new CMDIterator(agg,agg.getCartList(),i);
        Object x = invoke(getCart);
        return x;
    }

    public Object GetTagStock(String tag){
        Command byTag = new CMDIterator(agg,agg.getStockList(),tag);
        Object i = invoke(byTag);
        return i;
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
                               String Country, boolean isPrime) {
        Command addPref = new CMDSetPreference(agg, FirstName, LastName, Address, City, State, Country, isPrime);
        invoke(addPref);
    }

    public void getPreferences(){
        Command getPref = new CMDGetPreference(agg);
        invoke(getPref);
    }


}