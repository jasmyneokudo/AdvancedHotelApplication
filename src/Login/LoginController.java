package Login;

import com.jfoenix.controls.JFXButton;
import helpers.Routes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Apple
 */
public class LoginController implements Initializable {

        @FXML
    private AnchorPane anchorPane;
        
     @FXML
    private TextField nameField;

    @FXML
    private TextField passwordField;

    @FXML
    private JFXButton loginButton;

    @FXML
    private Label registerLabel;

    @FXML
    private Label forgotPassword;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void goToLoginPage(ActionEvent event) throws IOException 
    {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(Routes.HOMEVIEW));
                Stage stage = (Stage) anchorPane.getScene().getWindow();

                Scene scene = new Scene(pane);
                stage.setScene(scene);
                stage.setMaximized(true);
    }

    @FXML
    void goToRegister(MouseEvent event) throws IOException 
    {

        FadeTransition fade = new FadeTransition(Duration.seconds(2), anchorPane);
        fade.setFromValue(1.0);
        fade.setToValue(0.0);
        fade.play();
        AnchorPane pane = FXMLLoader.load(getClass().getResource(Routes.REGISTERVIEW));
        Stage stage = (Stage) anchorPane.getScene().getWindow();

        Scene scene = new Scene(pane);
        
        
        stage.setScene(scene);
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(1), pane);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
        
        
        //stage.setMaximized(true);
    }

    @FXML
    void goToforgotPassword(MouseEvent event) {

    }
    
    
}
