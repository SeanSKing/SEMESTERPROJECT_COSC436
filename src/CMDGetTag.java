/**
 * Created by JamieReed207 on 4/23/17.
 */
public class CMDGetTag implements Command {
    public void execute() {}

    public CMDGetTag(itemList list, String tag){
        System.out.println("-----------"+tag+"------------");

        listIterator byTag = new tagIterator(list,0,tag);
        while (byTag.hasNext()){
            System.out.println("Item: "+byTag.next().getItem());
        }
    }

}
