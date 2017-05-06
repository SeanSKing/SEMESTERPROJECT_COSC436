

/**
 * Created by JamieReed207 on 4/26/17.
 */

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class MainController {
    @FXML
    private TableView<Item> itemTable;
    @FXML
    private TableColumn<Item, String> ItemNameColumn;
    @FXML
    private TableColumn<Item, String> DescriptionColumn;
    @FXML
    private TableColumn<Item, Float> QuantityColumn;
    @FXML
    private TableColumn<Item, Float> PriceColumn;
    @FXML
    private TextField SearchBar;
    @FXML
    private Label itemLabel;
    @FXML
    private Label priceLabel;
    @FXML
    private Label cartSize;
    @FXML
    private Label cartTotal;
    @FXML
    private TextField signInBar;
    @FXML
    private Label UserLabel;
    @FXML
    private RadioButton nextDayRadio;
    @FXML
    private RadioButton twoDayRadio;
    @FXML
    private RadioButton groundRadio;

    private Item addItem;

    private Main main;

    public MainController() {}

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        ItemNameColumn.setCellValueFactory(cellData -> cellData.getValue().NameProperty());
        DescriptionColumn.setCellValueFactory(cellData -> cellData.getValue().DescriptonProperty());
        QuantityColumn.setCellValueFactory(cellData -> cellData.getValue().ItemQuantity().asObject());
        PriceColumn.setCellValueFactory(cellData -> cellData.getValue().ItemPrice().asObject());

        showItemDetails(null);

        itemTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showItemDetails(newValue));

        ToggleGroup ShippingGroup = new ToggleGroup();
        nextDayRadio.setToggleGroup(ShippingGroup);
        nextDayRadio.setUserData("nextDay");
        twoDayRadio.setToggleGroup(ShippingGroup);
        twoDayRadio.setUserData("twoDay");
        groundRadio.setToggleGroup(ShippingGroup);
        groundRadio.setUserData("ground");
        groundRadio.setSelected(true);
        ShippingGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                main.setShipping(ShippingGroup.getSelectedToggle().getUserData().toString());
            }
        });

    }

    private void showItemDetails(Item item) {
        if (item != null) {
            addItem = item;
            itemLabel.setText(item.getName());
            priceLabel.setText("$"+Float.toString(item.getPrice()));
        } else {
            itemLabel.setText("");
            priceLabel.setText("");

        }
    }

    @FXML
    private void addToCartButton(){
        if(addItem != null){
            main.addToCart(addItem);
            ObservableList<Item> cart = (ObservableList<Item>) main.getCartData();
            cartSize.setText(String.valueOf(cart.size()));
            Float total = Float.valueOf(0);
            for( Item item : cart){
                total = total + item.getPrice();
            }
            cartTotal.setText("$"+String.valueOf(total));
        } else{
            System.out.print("something went wrong");
        }
    }

    @FXML
    private void checkOutButton() throws Exception {
        main.checkoutPath();
    }
    @FXML
    private void signIn(){
        main.signIn(signInBar.getText());
        TypeAbstract user = (TypeAbstract) main.getPreferences();
        UserLabel.setText(user.getName());
    }

    @FXML
    private void searchButton(){
        itemTable.setItems((ObservableList<Item>) main.getSearch(SearchBar.getText()));
    }


    public void setMainApp(Main mainApp) {
        this.main = mainApp;
        itemTable.setItems((ObservableList<Item>) main.getItemData());


    }

}


