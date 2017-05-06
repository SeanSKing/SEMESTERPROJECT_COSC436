

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by JamieReed207 on 4/16/17.
 */
public class CartList implements ItemList {
    private ObservableList<Item> CartList = FXCollections.observableArrayList();
    private static double total;
    private static double shipping;

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

    public double getTotal(){
        total = 0;
        for( Item item : CartList){
            total = total + item.getPrice();
        }
        return total;
    }

    public void setShipping(double x){
        shipping = x;
    }

    public double getShipping(){
        return shipping;
    }

}



