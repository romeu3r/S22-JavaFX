package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class ViewController {

    @FXML
    public Button btTest;

    @FXML
    public void onBtTestAction() {
        Alerts.showAlert("Alert Title", null, "Hello!", Alert.AlertType.CONFIRMATION);
    }
}
