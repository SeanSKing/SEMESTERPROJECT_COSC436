

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by JamieReed207 on 4/16/17.
 */
public class CartList implements itemList{
    private ObservableList<Item> CartList = FXCollections.observableArrayList();
    private static double total;

    public void addItem(Item item){
        CartList.add(item);
    }

    public void removeItem(int i){
        CartList.remove(i);
    }

    public List getList(){
        return CartList;
    }

    public Item getItemByIndex(int i){
        return CartList.get(i);
    }

    public int getSize() {return CartList.size();}


}
