/**
 * Created by JamieReed207 on 5/1/17.
 */
public class ReceiptGreetings implements Receipt {
    protected Receipt receipt;

    public ReceiptGreetings(Receipt r){
        receipt = r;
    }
    public void Printer() {
        System.out.println("   *        *   *        *    *****  ******  **   *    ");
        System.out.println("  * *      * * * *      * *      *   *    *  * *  *    ");
        System.out.println(" *****    *   *   *    *****   *     *    *  *  * *    ");
        System.out.println("*     *  *         *  *     * *****  ******  *   **    ");
        System.out.println("____________________________________________________   ");

        receipt.Printer();
    }
}
