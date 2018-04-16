package main.app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class IDEController implements Initializable {
	
	@FXML public ListView<String> listView; 
	
	
	
	ObservableList<String> list = FXCollections.observableArrayList("Button", "Checkbox", "Label", "Textfield");

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		listView.setItems(list); 
	}
	
	public void handleButtonAction(){
		  
	}

}
