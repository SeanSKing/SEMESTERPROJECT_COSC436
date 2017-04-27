

/**
 * Created by JamieReed207 on 4/26/17.
 */

import javafx.beans.property.*;

import java.util.Arrays;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Item {

    private final StringProperty ItemName;
    private final StringProperty ItemDescription;
    private final FloatProperty ItemQuantity;
    private final FloatProperty ItemPrice;
    private String[] Itemtags;

    public Item() {
        this(null, 0,null,0,null);
    }


    public Item(String itemName,int itemQuantity, String itemDesctiption, float itemPrice, String[] itemTags) {
        this.ItemName = new SimpleStringProperty(itemName);
        this.ItemDescription = new SimpleStringProperty(itemDesctiption);
        this.ItemQuantity = new SimpleFloatProperty(itemQuantity);
        this.ItemPrice = new SimpleFloatProperty(itemPrice);
        this.Itemtags = itemTags;
    }

    public Item getItem(){
        return this;
    }

    public String getName() {
        return ItemName.get();
    }

    public void setName(String Name) {
        this.ItemName.set(Name);
    }

    public StringProperty NameProperty() {
        return ItemName;
    }

    public String getDescripton() {
        return ItemDescription.get();
    }

    public void setDescripton(String Description) {
        this.ItemDescription.set(Description);
    }

    public StringProperty DescriptonProperty() {
        return ItemDescription;
    }

    public float getQuantity(){
        return ItemQuantity.get();
    }

    public void setItemQuantity(int Quantity){
        this.ItemQuantity.set(Quantity);
    }

    public FloatProperty ItemQuantity(){
        return ItemQuantity;
    }

    public float getPrice(){
        return ItemPrice.get();
    }

    public void setItemPrice(int Price){
        this.ItemPrice.set(Price);
    }

    public FloatProperty ItemPrice(){
        return ItemPrice;
    }

    public boolean hasTag(String tag){
        return Arrays.asList(this.Itemtags).contains(tag );
    }


}