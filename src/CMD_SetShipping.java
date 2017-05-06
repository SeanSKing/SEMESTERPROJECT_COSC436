/**
 * Created by JamieReed207 on 5/5/17.
 */
public class CMD_SetShipping implements Command{
    private Aggregator aggregator;
    private ShipOptions shipOptions;

    public CMD_SetShipping(Aggregator agg, String shipping){
        this.aggregator = agg;
        if (shipping == "nextDay"){
            shipOptions = new ShipNextDay();
        } else if(shipping == "twoDay"){
            shipOptions = new ShipTwoDay();
        } else {
            shipOptions = new ShipGround();
        }
    }
    public Object execute() {
        aggregator.setShipMethod(shipOptions);
        return null;
    }
}
