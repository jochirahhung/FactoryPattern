package main.app;

import javafx.scene.control.Label;

public class JavaFxLabel implements Components {
	
	private String context;
	
	public JavaFxLabel(String context){
		this.context = context; 
	}

	//Creates a label in JavaFX 
	public String code() {
		Label label1 = new Label(context); 
		label1.autosize(); 
		return null;
	}

	public StringBuilder buildComponent(StringBuilder html, int height, int width, int left, int top, String text) {
		// TODO Auto-generated method stub
		return null;
	} 

}
