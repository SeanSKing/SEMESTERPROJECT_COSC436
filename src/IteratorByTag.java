 /**
 * Created by JamieReed207 on 4/17/17.
 */
public class IteratorByTag implements IteratorInterface {
    private int current;
    private ItemList all_list;
    private String searchTag;

    public IteratorByTag(ItemList list, int start, String tag){
        current = start;
        all_list = list;
        searchTag = tag;
    }
    public boolean hasNext() {
        while( current < all_list.getSize()){
            Item check = all_list.getItemByIndex(current);
            if(check.hasTag(searchTag)){
                return true;
            }
            current++;
        };
        return false;
    }


    public Item next() {
        return all_list.getItemByIndex(current++);
    }
}

