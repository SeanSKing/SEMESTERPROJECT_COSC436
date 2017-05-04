/**
 * Created by JamieReed207 on 5/1/17.
 */
public class ShipSelector {
    private CartList cartList;
    private Boolean prime;
    private double ship;

    public ShipSelector(Aggregator agg, Boolean P){
        cartList = agg.getCartList();
        prime = P;
    }


    public void getOptions() {
        System.out.println("Next Day");
        System.out.print(new ShipGround(cartList,prime).calculate());

        System.out.println("2 Day");

        System.out.println("Ground");

    }


    public void setOption(int i) {

    }
}
