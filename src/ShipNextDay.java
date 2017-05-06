import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 5/5/17.
 */
public class ShipNextDay implements ShipOptions {
    private double StarterRate = 10;
    private double weightRate = 3;
    private ObservableList<Item> cartlist;
    private Boolean Prime;


    public void set(CartList cart, Boolean p){
        cartlist = (ObservableList<Item>) cart.getList();
        Prime = p;
    }

    @Override
    public double calculate() {
        double weight = 0;
        for (Item item : cartlist) {
            weight = weight + item.getQuantity();
        }
        return StarterRate + (weightRate*weight);
    }
}
