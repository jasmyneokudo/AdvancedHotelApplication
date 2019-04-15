package Rooms;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;


/**
 * FXML Controller class
 *
 * @author Apple
 */
public class RoomsController implements Initializable {

     @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label noOfRoomTypes;

    @FXML
    private StackPane stackPane;

    @FXML
    private AnchorPane roomTypePane;

    @FXML
    private JFXTextField roomNumberField;

    @FXML
    private JFXComboBox<String> roomTypeCombo;

    @FXML
    private VBox imageFilesVbox;

    @FXML
    private JFXButton addImageButton;

    @FXML
    private AnchorPane roomPane;

    @FXML
    private JFXTextField roomNameField;

    @FXML
    private JFXTextField roomCostField;

    @FXML
    private JFXTextArea roomDescriptionField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    void addNewRoom(ActionEvent event) {

    }

    @FXML
    void addNewRoomType(ActionEvent event) {

    }

    @FXML
    void goToNewRoomForm(MouseEvent event) {
        roomPane.setVisible(true);
        roomTypePane.setVisible(false);
        
    }

    @FXML
    void goToRoomTypeForm(MouseEvent event) {
        roomTypePane.setVisible(true);
        roomPane.setVisible(false);
        
    }
        
    
}
