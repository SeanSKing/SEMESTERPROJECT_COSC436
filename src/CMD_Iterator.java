/**
 * Created by JamieReed207 on 5/1/17.
 */
public class CMD_Iterator implements Command {
    private IteratorInterface itr;
    private ItemList Observer;

    public ItemList execute() {
        while(itr.hasNext()) {
            Observer.addItem(itr.next());
        }
        return Observer;
    }

    public CMD_Iterator(Aggregator agg, ItemList list, int i){
        itr = new IteratorByAll(list, i);
    }

    public CMD_Iterator(Aggregator agg, ItemList list, String tag){
        itr = new IteratorByTag(list,0,tag);
    }
}
