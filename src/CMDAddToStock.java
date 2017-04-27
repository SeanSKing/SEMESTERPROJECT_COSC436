 /**
 * Created by JamieReed207 on 4/23/17.
 */
public class CMDAddToStock implements Command {
    private StockList stockList;

    public CMDAddToStock(Aggregator agg){
         stockList = agg.getStockList();
    }

    public Object execute() {
        String [] newTag = { "camera", "electronics" };
        stockList.addItem(new Item("Camera", 20, "cool camera", 20, newTag));
        newTag = new String[]{"food","health"};
        stockList.addItem(new Item("Banana", 100, "yellow Banana", 10, newTag));
        newTag = new String[]{"electronics","fitness","health"};
        stockList.addItem(new Item("fitbit", 20, "activity tracker", 120,newTag));
        newTag = new String[]{"electronics"};
        stockList.addItem(new Item("Garmin", 20, "never get lost again", 80,newTag));
        newTag = new String[]{"food","fitness","health"};
        stockList.addItem(new Item("Protein", 20, "cool camera", 20,newTag));
        newTag = new String[]{"health"};
        stockList.addItem(new Item("toothbrush", 20, "brush your teeth kids", 20,newTag));
        return null;
    }
}
