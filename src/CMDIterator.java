/**
 * Created by JamieReed207 on 4/23/17.
 */
public class CMDIterator implements Command {
    public void execute(){}
    public void execute(listIterator iter) {
        while(iter.hasNext()) {
            System.out.println("Item: " + iter.next().getItem());
        }
    }

    public CMDIterator(itemList list, int i){

    System.out.println("-------------ALL------------------");

    //test out iterators
    listIterator all = new allIterator(list, i);
        execute(all);

    }

    public CMDIterator(itemList list, String tag){
        System.out.println("-----------"+tag+"------------");
        listIterator byTag = new tagIterator(list,0,tag);
        execute(byTag);
    }
}
