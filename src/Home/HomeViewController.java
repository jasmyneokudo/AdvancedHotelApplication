package Home;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import helpers.Routes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Apple
 */
public class HomeViewController implements Initializable {


    @FXML
    private JFXHamburger hamburger;


    @FXML
    private AnchorPane pane;

    @FXML
    private JFXDrawer drawer;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       
        HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent e) -> {
            transition.setRate(transition.getRate() * -1);
            transition.play();
            //drawer.setDisable(false);
            if (drawer.isShown()) {
                drawer.close();
                drawer.setDisable(true);
            } else {
                drawer.setDisable(false);
                drawer.open();
            }

        });
        
        try 
        {
            VBox sidePane = FXMLLoader.load(getClass().getResource(Routes.DRAWERVIEW));
        
            AnchorPane welcome = FXMLLoader.load(getClass().getResource(Routes.DASHBOARD));
            setNode(welcome);
            drawer.setSidePane(sidePane);
            
            for (Node node : sidePane.getChildren()) {
                if (node.getAccessibleText() != null) {
                    node.addEventHandler(MouseEvent.MOUSE_PRESSED, (MouseEvent ev) -> {
                        switch (node.getAccessibleText()) 
                        {
                            case "homeMenu":
                                try 
                                {
                                    drawer.close();
                                    drawer.setDisable(true);
                                    setNode(FXMLLoader.load(getClass().getResource(Routes.DASHBOARD)));
                                } catch (IOException ex) {
                                    Logger.getLogger(HomeViewController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                break;
                            case "guestsMenu":
                                AnchorPane guests;
                                try {
                                    guests = FXMLLoader.load(getClass().getResource(Routes.GUESTSVIEW));
                                    drawer.close(); 
                                    drawer.setDisable(true);
                                    setNode(guests);
                                } catch (IOException ex) {
                                    Logger.getLogger(HomeViewController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                break;
                            case "roomsMenu":
                                AnchorPane rooms;
                                try 
                                {
                                    rooms = FXMLLoader.load(getClass().getResource(Routes.ROOMSVIEW));
                                    drawer.close();
                                    drawer.setDisable(true);
                                    setNode(rooms);
                                } catch (IOException ex) {
                                    Logger.getLogger(HomeViewController.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                break;
                            case "historyMenu":
                                AnchorPane history;
                                try 
                                {
                                    history = FXMLLoader.load(getClass().getResource(Routes.DASHBOARD));
                                    drawer.close(); 
                                    drawer.setDisable(true);
                                    setNode(history);
                                } catch (IOException ex) {
                                    Logger.getLogger(HomeViewController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                break;  
                            case "changePassMenu":
                               AnchorPane changePassword;
                                try 
                                {
                                    changePassword = FXMLLoader.load(getClass().getResource(Routes.DASHBOARD));
                                    drawer.close();
                                   drawer.setDisable(true);
                                   setNode(changePassword);
                                } catch (IOException ex) {
                                    Logger.getLogger(HomeViewController.class.getName()).log(Level.SEVERE, null, ex);
                                }

                                break;   
                        }
                    });
                }

            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }    
    
     public void setNode(Node node) {
        pane.getChildren().clear();
        pane.getChildren().add((Node) node);
    }
}
