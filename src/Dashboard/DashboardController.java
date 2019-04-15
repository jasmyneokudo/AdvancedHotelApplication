package Dashboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class DashboardController implements Initializable{

    @FXML
    private StackPane stackPane;

    @FXML
    private VBox roomsExplanationVbox;

    @FXML
    private Label occupiedRooms;

    @FXML
    private Label unoccupiedRooms;

    @FXML
    private HBox roomsHbox;

    @FXML
    private Label numiberOfRooms;

    @FXML
    private Label nameLabel;

    @FXML
    private Label currentDate;

    @FXML
    private Label currentTime;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
