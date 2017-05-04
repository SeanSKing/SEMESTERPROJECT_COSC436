/**
 * Created by JamieReed207 on 5/1/17.
 */
public class CMDgetShipping implements Command{
    private Aggregator aggregator;
    private Boolean prime;

    public Object execute() {
        new ShipSelector(aggregator,prime).getOptions();
        return null;
    }

    public CMDgetShipping(Aggregator agg, Boolean p){
        aggregator = agg;
        prime = p;
    }
}
