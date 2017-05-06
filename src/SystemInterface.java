/**
 * Created by JamieReed207 on 4/24/17.
 */
public class SystemInterface {
    private static Invoker invokes;
    public void setInvoker(Invoker invoker){
        invokes = invoker;
    }


    public Object GetAllStock() {
        Object invokedObject = invokes.GetAllStock(0);
        return invokedObject;
    }

    public void AddToCart(int i) {
        invokes.AddToCart(i);
    }

    public void AddToCart(Item item){invokes.AddToCart(item);}

    public Object GetAllCart() {
        Object invokedObject = invokes.GetAllCart(0);
        return  invokedObject;
    }

    public Object GetTagStock(String s) {
        Object invokedObject = invokes.GetTagStock(s);
        return invokedObject;
    }

    public Object getShipping(){
        Object invokedObject = invokes.getShipping();
        return invokedObject;
    }

    public void signIn(String name){
        invokes.SignIn(name);
    }

    public void RemoveFromCart(int i){
        invokes.RemoveFromCart(i);
    }

    public Object GetPreferences(){
        Object invokedObject = invokes.getPreferences();
        return invokedObject;
    }

    public void setShipping(String shipping){
        invokes.setShipping(shipping);
    }

    public void checkOut(){
        invokes.checkOut();
    }
}
