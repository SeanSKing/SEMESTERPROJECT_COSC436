

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by JamieReed207 on 4/23/17.
 */
public class CMDIterator implements Command {
    private listIterator itr;
    private ObservableList<Item> Observer = FXCollections.observableArrayList();

    public ObservableList<Item> execute() {
        while(itr.hasNext()) {
            Observer.add(itr.next());
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
