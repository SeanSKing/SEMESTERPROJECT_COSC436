

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 4/23/17.
 */
public class CMD_ObservableIterator implements Command {
    private IteratorInterface itr;
    private ObservableList<Item> Observer = FXCollections.observableArrayList();

    public ObservableList<Item> execute() {
        while(itr.hasNext()) {
            Observer.add(itr.next());
        }
        return Observer;
    }

    public CMD_ObservableIterator(Aggregator agg, ItemList list, int i){
        itr = new IteratorByAll(list, i);
    }

    public CMD_ObservableIterator(Aggregator agg, ItemList list, String tag){
        itr = new IteratorByTag(list,0,tag);
    }
}
