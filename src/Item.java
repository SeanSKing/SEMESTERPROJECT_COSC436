import java.util.Arrays;

/**
 * Created by JamieReed207 on 4/13/17.
 */
public class Item {
    private String name;
    private int quantity;
    private String description;
    private double price;
    private String[] tags;

    public Item(String name, int quantity, String description, double price, String[] tags){
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
        this.tags = tags;
    }

    public String getItem(){
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public boolean hasTag(String tag){
        return Arrays.asList(this.tags).contains(tag );
    }
}

