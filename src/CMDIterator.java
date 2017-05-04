/**
 * Created by JamieReed207 on 5/1/17.
 */
public class CMDIterator implements Command {
    private listIterator itr;
    private itemList Observer;

    public itemList execute() {
        while(itr.hasNext()) {
            Observer.addItem(itr.next());
        }
        return Observer;
    }

    public CMDIterator(Aggregator agg, itemList list, int i){
        itr = new allIterator(list, i);
    }

    public CMDIterator(Aggregator agg, itemList list, String tag){
        itr = new tagIterator(list,0,tag);
    }
}
