package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.AlienDictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private AlienDictionary model;

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
    	model.reset();
    	txtRisposta.clear();
    	txtParola.clear();
    }
    @FXML
    void doTranslate(ActionEvent event) {
    	String inserimento = txtParola.getText();
    	if (inserimento.matches("[a-zA-Z\s]*")) {

    		inserimento = inserimento.toLowerCase();
    		if(inserimento.contains(" ")) {
    			String[] campi = inserimento.split(" ");
    			String alien = campi[0];
    			String trad = campi[1];
    			model.addWord(alien, trad);
    			txtRisposta.setText("Parola inserita al dizionario");
    		}else {
    			txtRisposta.setText(model.translateWord(inserimento));
    		}
    	}else {
    		txtRisposta.setText("Formato non corretto");
    	}
    }
    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert butTranslate != null : "fx:id=\"butTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisposta != null : "fx:id=\"txtRisposta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert butClean != null : "fx:id=\"butClean\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    public void setModel(AlienDictionary model) {
    	this.model = model;
    }
}
