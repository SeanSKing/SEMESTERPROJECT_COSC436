import java.util.ArrayList;
import java.util.List;

/**
 * Created by JamieReed207 on 4/16/17.
 */
public class CartList implements itemList{
    private List<Item> CartList = new ArrayList<Item>();
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
