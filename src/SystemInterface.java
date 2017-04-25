/**
 * Created by JamieReed207 on 4/24/17.
 */
public class SystemInterface {
    private static Invoker invokes;
    public void setInvoker(Invoker invoker){
        invokes = invoker;
    }
    public void run(){
        invokes.SetPreferences("John","Smith","123 Main St","Baltimore","MD","USA",true);
        invokes.AddToStock();
        invokes.GetAllStock(0);
        invokes.AddToCart(1);
        invokes.GetAllCart(0);
        invokes.AddToCart(3);
        invokes.GetAllCart(0);
        invokes.GetTagStock("health");
        invokes.RemoveFromCart(0);
        invokes.GetAllCart(0);
    }
}
