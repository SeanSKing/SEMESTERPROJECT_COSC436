import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 5/5/17.
 */
public class CMD_CheckOut implements Command{
    private ShipOptions shipOptions;
    private Aggregator aggregator;

    public CMD_CheckOut(Aggregator agg){
         shipOptions = agg.getShipMethod();
        aggregator = agg;
    }

    @Override
    public Object execute() {
        shipOptions.set(aggregator.getCartList(),aggregator.getUserPref().getPrime());
        double shippingCost = shipOptions.calculate();
        Receipt starter = new ReceiptItems((ObservableList) aggregator.getCartList().getList(),shippingCost);
        Receipt greeting = new ReceiptGreetings(starter);
        Receipt farewell = new ReceiptFarewell(greeting);
        farewell.Printer();
        return null;
    }
}
