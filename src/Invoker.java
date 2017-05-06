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
        Command add = new CMD_AddToCart(agg,i);
        invoke(add);
    }

     public void AddToCart(Item item){
         Command add = new CMD_AddToCart(agg, item);
         invoke(add);
     }

    public Object GetAllStock(int i){
        Command getStock = new CMD_ObservableIterator(agg,agg.getStockList(),i);
        Object x = invoke(getStock);
        return  x;
    }

    public Object GetAllCart(int i){
        Command getCart = new CMD_ObservableIterator(agg,  agg.getCartList(),i);
        Object x = invoke(getCart);
        return x;
    }

    public Object GetTagStock(String tag){
        Command byTag = new CMD_ObservableIterator(agg, agg.getStockList(),tag);
        Object i = invoke(byTag);
        return i;
    }

     public void SignIn(String name){
         Command sign = new CMD_SignIn(agg,name);
         invoke(sign);
     }


    public void RemoveFromCart(int i){
        Command remove = new CMD_RemoveFromCart(agg.getCartList(),i);
        invoke(remove);
    }

    public Object getPreferences(){
        Command getPref = new CMD_GetPreference(agg);
        Object pref = invoke(getPref);
        return pref;
    }

     public Object getShipping(){
         PreferenceUtil prime = (PreferenceUtil) getPreferences();
         Object getShip = new CMD_GetShipping(agg,prime.getPrime());
         return getShip;
     }

     public void setShipping(String shipping){
         Command setShip = new CMD_SetShipping(agg,shipping);
         invoke(setShip);
     }

     public void checkOut(){
         Command checkOut = new CMD_CheckOut(agg);
         invoke(checkOut);
     }


}