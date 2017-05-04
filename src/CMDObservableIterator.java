

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 4/23/17.
 */
public class CMDObservableIterator implements Command {
    private listIterator itr;
    private ObservableList<Item> Observer = FXCollections.observableArrayList();

    public ObservableList<Item> execute() {
        while(itr.hasNext()) {
            Observer.add(itr.next());
        }
        return Observer;
    }

    public CMDObservableIterator(Aggregator agg, itemList list, int i){
        itr = new allIterator(list, i);
    }

    public CMDObservableIterator(Aggregator agg, itemList list, String tag){
        itr = new tagIterator(list,0,tag);
    }
}
