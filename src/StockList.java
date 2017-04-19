import java.util.ArrayList;
import java.util.List;

/**
 * Created by JamieReed207 on 4/16/17.
 */
public class StockList {
    private static StockList instance = null;
    private List<Item> StockList = new ArrayList<Item>();

    public static StockList getInstance() {
        if(instance == null) {
            instance = new StockList();
        }
        return instance;
    }

    public void addItem(Item item){
        StockList.add(item);
    }

    public List getStockList(){
        return StockList;
    }

    public Item getItemByIndex(int i){
        return StockList.get(i);
    }

    public void printStock(){
        for( Item item : StockList){
            System.out.println("Item: " + item.getItem());
        }
    }

    public int getSize(){
        return StockList.size();
    }
}
