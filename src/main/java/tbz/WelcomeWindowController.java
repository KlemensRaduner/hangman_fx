package tbz;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class WelcomeWindowController  {

    @FXML
    TextField textField;

    @FXML
    Button startButton;

    @FXML
    Button cancelButton;

    public void startGame(){
        System.out.println("start");
    }
}
