 /**
 * Created by JamieReed207 on 4/26/17.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private SystemInterface SI;
    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Amazon");

        initRootLayout();
        showItemOverview();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showItemOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Gooey.fxml"));
            AnchorPane ItemOverview = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(ItemOverview);

            // Give the controller access to the main app.
            MainController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Object getItemData() {
        return  SI.GetAllStock();
    }

    public void addToCart(Item item){
        SI.AddToCart(item);
    }

    public Object getCartData(){ return SI.GetAllCart();}

    public Object getSearch(String s){
        return SI.GetTagStock(s);
    }

    public void signIn(String name){
        SI.signIn(name);
    }

    public void checkoutPath(){
        ObservableList cart = (ObservableList<Item>) SI.GetAllCart();
        Receipt starter = new ReceiptItems(cart);
        Receipt greeting = new ReceiptGreetings(starter);
        Receipt farewell = new ReceiptFarewell(greeting);

        farewell.Printer();

    }


   public Main(){
       Invoker invokes = new Invoker(new Aggregator());
       SI = new SystemInterface();
       SI.setInvoker(invokes);
   }

    public static void main(String[] args) {launch(args);}
}

