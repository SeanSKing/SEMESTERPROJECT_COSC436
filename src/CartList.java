import java.util.ArrayList;
import java.util.List;

/**
 * Created by JamieReed207 on 4/16/17.
 */
public class CartList {
    private static CartList instance = null;
    private List<Item> CartList = new ArrayList<Item>();
    private static double total;

    public static CartList getInstance() {
        if(instance == null) {
            instance = new CartList();
        }
        return instance;
    }


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

    public void printCart(){
        for( Item item : CartList){
            System.out.println("Item: " + item.getItem()+"............."+item.getPrice());
        }
    }

    public void printTotal(){
        total = 0;
        for( Item item : CartList){
            total = total + item.getPrice();
        }
        System.out.println("                 Total: $" + total);
    }

    public void printCartSize(){
        System.out.println("Item Count: "+CartList.size());
    }
}
