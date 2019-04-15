package Register;

import com.jfoenix.controls.JFXButton;
import helpers.Routes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Apple
 */
public class RegisterController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TextField nameField;

    @FXML
    private TextField numberField;

    @FXML
    private TextField answerField;

    @FXML
    private TextField questionField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPassField;

    @FXML
    private JFXButton registerButton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    @FXML
    void goToLogin(MouseEvent event) throws IOException {
        
        AnchorPane pane = FXMLLoader.load(getClass().getResource(Routes.LOGINVIEW));
        Stage stage = (Stage) anchorPane.getScene().getWindow();

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        //stage.setMaximized(true);

    }

    @FXML
    void registerUser(MouseEvent event) {

    }
    
}
