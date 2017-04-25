/**
 * Created by JamieReed207 on 4/13/17.
 */
public class CMDAddToCart implements Command {

    public CMDAddToCart(Aggregator agg, int i){
        agg.getCartList().addItem( agg.getStockList().getItemByIndex(i));
    }

    public void execute() {}
}