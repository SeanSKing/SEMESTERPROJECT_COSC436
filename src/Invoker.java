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
        Command getStock = new CMDObservableIterator(agg,agg.getStockList(),i);
        Object x = invoke(getStock);
        return  x;
    }

    public Object GetAllCart(int i){
        Command getCart = new CMDObservableIterator(agg,  agg.getCartList(),i);
        Object x = invoke(getCart);
        return x;
    }

    public Object GetTagStock(String tag){
        Command byTag = new CMDObservableIterator(agg, agg.getStockList(),tag);
        Object i = invoke(byTag);
        return i;
    }

     public void SignIn(String name){
         Command sign = new CMDSignIn(agg,name);
         invoke(sign);
     }



    public void RemoveFromCart(int i){
        Command remove = new CMDRemoveFromCart(agg.getCartList(),i);
        invoke(remove);
    }

    public Object getPreferences(){
        Command getPref = new CMDGetPreference(agg);
        Object pref = invoke(getPref);
        return pref;
    }

     public Object getShipping(){
         PreferenceUtil prime = (PreferenceUtil) getPreferences();
         Object shipping = new CMDgetShipping(agg,prime.getPrime());
         return shipping;

     }


}