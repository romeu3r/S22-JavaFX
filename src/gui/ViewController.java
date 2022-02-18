package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import model.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    public ComboBox<Person> comboBoxPerson;

    private ObservableList<Person> observableList;

    @FXML
    public void onComboBoxAction() {
        Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
        System.out.println(person);
    }

    @FXML
    public Button btAll;

    public void onBtAll() {
        comboBoxPerson.getItems().forEach(System.out::println);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(0, "Willian", "willian@gmail"));
        list.add(new Person(1, "Jose", "Jose@gmail"));
        list.add(new Person(2, "Maria", "Maria@gmail"));
        list.add(new Person(3, "Jessica", "Jessica@gmail"));
        list.add(new Person(4, "Teste", "Teste@gmail"));
        observableList = FXCollections.observableList(list);
        comboBoxPerson.setItems(observableList);
    }
}
