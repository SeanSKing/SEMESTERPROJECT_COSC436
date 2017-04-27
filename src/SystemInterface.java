

/**
 * Created by JamieReed207 on 4/24/17.
 */
public class SystemInterface {
    private static Invoker invokes;
    public void setInvoker(Invoker invoker){
        invokes = invoker;
    }
    public void SetPreferences(String FirstName, String LastName,
                               String Address, String City, String State,
                               String Country, boolean isPrime) {
        invokes.SetPreferences(FirstName, LastName, Address, City, State, Country, isPrime);
    }

    public void AddToStock() {
        invokes.AddToStock();
    }

    public Object GetAllStock() {
        Object invokedObject = invokes.GetAllStock(0);
        return invokedObject;
    }

    public void AddToCart(int i) {
        invokes.AddToCart(i);
    }

    public void AddToCart(Item item){invokes.AddToCart(item);}

    public listIterator GetAllCart() {
        Object invokedObject = invokes.GetAllCart(0);
        return (listIterator) invokedObject;
    }

    public listIterator GetTagStock(String s) {
        Object invokedObject = invokes.GetTagStock(s);
        return (listIterator) invokedObject;
    }

    public void RemoveFromCart(int i){
        invokes.RemoveFromCart(i);
    }

    public void GetPreferences(){
        invokes.getPreferences();
    }
}
