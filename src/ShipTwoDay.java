import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 5/5/17.
 */
public class ShipTwoDay implements ShipOptions {
    private double StarterRate = 5;
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
