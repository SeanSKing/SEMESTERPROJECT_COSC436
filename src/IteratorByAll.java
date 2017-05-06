 /**
 * Created by JamieReed207 on 4/17/17.
 */
public class IteratorByAll implements IteratorInterface {
    private int current;

    private ItemList all_list;

    public IteratorByAll(ItemList list, int start){
        current = start;
        all_list = list;
    }
    public boolean hasNext() {
        return current < all_list.getSize();
    }


    public Item next() {
        return all_list.getItemByIndex(current++);
    }
}
