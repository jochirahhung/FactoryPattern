package main.app;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea; 

public class IDEController implements Initializable {
	
	@FXML public ListView<String> listView; 
	@FXML public TextArea textArea;  
//	@FXML public TextField textField; 
//	@FXML public TextField height;
//	@FXML public TextField width; 
//	@FXML public TextField top;
//	@FXML public TextField left; 
	 
	 
	private String displayArea = "";
	private List<String> usedItems = new ArrayList<String>(); 
	
	ObservableList<String> list = FXCollections.observableArrayList("Button", "Checkbox", "Label", "Textfield");

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		listView.setItems(list); 
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); 
	}
	
	//This method adds the users choices to the display area
	public void addButtonPushed(){
		
		
		ObservableList<String> displayItems = listView.getSelectionModel().getSelectedItems(); 
		
		for(Object item: displayItems){
			usedItems.add((String)item);  
			displayArea += String.format("%s%n",(String) item);  
		} 
		 
		textArea.setText(displayArea);  
	}
	
	public void htmlButtonPushed(){
		textArea.setText("html was pushed"); 
	}
	
	public void javaButtonPushed(){
		textArea.setText("java was pushed"); 
	} 
	
	public void submitButtonPushed(){ 
		textArea.setText("submit was pushed"); 
	}
	
	public void undoButtonPushed(){
	  displayArea = ""; 
//	  String[] undoList = new String[usedItems.size()];
//	  undoList = usedItems.toArray(undoList); 
//	 
//		for(int i = 0; i < undoList.length-2; i++){
//			
//			displayArea += "Hey I got here";		
//		}    
	 
		textArea.setText(displayArea);  
	}

}
