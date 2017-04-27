

/**
 * Created by JamieReed207 on 4/26/17.
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class Controller {
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

    private Item addItem;


    // Reference to the main application.
    private Main main;

    public Controller() {}

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


    }

    private void showItemDetails(Item item) {
        if (item != null) {
            addItem = item;
            itemLabel.setText(item.getName());
            priceLabel.setText(Float.toString(item.getPrice()));
        } else {
            itemLabel.setText("");
            priceLabel.setText("");

        }
    }

    @FXML
    private void addToCartButton(){
        if(addItem != null){
            System.out.print("added");
            main.addToCart(addItem);
        } else{
            System.out.print("no item");
        }
    }

    public void setMainApp(Main mainApp) {
        this.main = mainApp;

        // Add observable list data to the table
        itemTable.setItems(mainApp.getItemData());

    }
}


