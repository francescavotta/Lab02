package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button butTranslate;

    @FXML
    private TextArea txtRisposta;

    @FXML
    private Button butClean;

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert butTranslate != null : "fx:id=\"butTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisposta != null : "fx:id=\"txtRisposta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert butClean != null : "fx:id=\"butClean\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
