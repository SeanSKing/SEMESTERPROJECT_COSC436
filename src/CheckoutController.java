import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * Created by JamieReed207 on 4/27/17.
 */
public class CheckoutController{

    @FXML
    private ListView Cartlist;
    @FXML
    private Label nextDay;
    @FXML
    private Label twoDay;
    @FXML
    private Label ground;

    private Main main;

    private void initialize(){
        Cartlist.setItems((ObservableList) main.getCartData());
        Cartlist.setCellFactory(param -> new ListCell<Item>() {
            @Override
            protected void updateItem(Item item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null || item.getName() == null) {
                    setText(null);
                } else {
                    setText(item.getName());
                }
            }
        });


    }

    public void setMain(Main mainapp){
        this.main = mainapp;
    }

    public void start(Stage window) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/checkoutView.fxml"));
        Scene scene =  new Scene(root, 300 ,300);
        window.setScene(scene);
        window.show();
        
        nextDay.setText("hi");
        twoDay.setText("hey");
        ground.setText("ground");
    }
}
