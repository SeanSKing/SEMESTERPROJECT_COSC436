

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by JamieReed207 on 4/16/17.
 */
public class StockList implements ItemList {
    private ObservableList<Item> StockList = FXCollections.observableArrayList();

    public void addItem(Item item){
        StockList.add(item);
    }

    public void removeItem(int i){
        StockList.remove(i);
    }

    public List getList(){
        return StockList;
    }

    public Item getItemByIndex(int i){
        return StockList.get(i);
    }

    public int getSize(){return StockList.size();}

    public void printStock(){
        for( Item item : StockList){
            System.out.println("Item: " + item.getName());
        }
    }
}
