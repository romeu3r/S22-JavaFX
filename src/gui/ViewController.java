package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

    @FXML
    public TextField txtNumber1;
    @FXML
    public TextField txtNumber2;

    @FXML
    public Label labelResult;

    @FXML
    public Button btSum;

    @FXML
    public void onBtSumAction() {
        try {
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());
            double sum = num1 + num2;
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error", "Parse error", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}
