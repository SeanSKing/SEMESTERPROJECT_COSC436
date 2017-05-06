import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 5/2/17.
 */
public class ShipGround implements ShipOptions {
    private double StarterRate = 3;
    private double weightRate = 2;
    private ObservableList<Item> cartlist;
    private Boolean Prime;


    public void set(CartList cart, Boolean p){
        cartlist = (ObservableList<Item>) cart.getList();
        Prime = p;
    }

    public double calculate(){
        if(!Prime) {
            double weight = 0;
            for (Item item : cartlist) {
                weight = weight + item.getQuantity();
            }
            return (StarterRate + (weightRate * weight));
        } else
            return 0;
    }
}
