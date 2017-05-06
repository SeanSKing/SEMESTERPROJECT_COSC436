import javafx.collections.ObservableList;

import java.text.DecimalFormat;

/**
 * Created by JamieReed207 on 5/1/17.
 */
public class ReceiptItems implements Receipt {
    private ObservableList<Item> c;
    private double shippingCost;
    public ReceiptItems(ObservableList cart, Double shipping){
        c=cart;
        shippingCost = shipping;
    }
    public void Printer() {
        double total = 0;
        for (Item item: c ) {
            total = total + item.getPrice();
            System.out.println(item.getName()+"...........................s..............$"+item.getPrice());
        }
        System.out.println("____________________________________________________   ");
        System.out.println("Item Cost.......................................$"+total);
        System.out.println("Shipping........................................$"+shippingCost);
        double tax = total * 0.07;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(String.format("tax.............................................$" + df.format(tax)));
        double cost = tax + total + shippingCost;
        System.out.println("Total..........................................$"+cost);

    }
}
