/**
 * Created by JamieReed207 on 4/17/17.
 */
public class allIterator implements listIterator  {
    private int current;

    private StockList all_list;

    public allIterator(StockList list, int start){
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
