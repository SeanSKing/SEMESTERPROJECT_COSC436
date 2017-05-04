/**
 * Created by JamieReed207 on 5/2/17.
 */
public class ReceiptFarewell implements Receipt {
    protected Receipt receipt;

    public ReceiptFarewell(Receipt r){
        receipt = r;
    }

    public void Printer() {
        receipt.Printer();
        System.out.println("Thanks for shopping come again");
    }
}
