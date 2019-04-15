
import helpers.Routes;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Apple
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource(Routes.LOGINVIEW));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Main.class.getResource("/Styles/style.css").toExternalForm());
        //primaryStage.getIcons().add(new Image("imgs/logo1.png"));
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
