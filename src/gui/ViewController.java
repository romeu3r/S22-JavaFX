package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    public Button btTest;

    @FXML
    public void onBtTestAction(){
        System.out.println("OK");
    }
}
