package main.app;

import javax.swing.JCheckBox;
import javax.swing.*;

public abstract class ComponentFactory {
	
	abstract int chooseHeight(int height);
	
	abstract int chooseWidth(int width);
	
	abstract int chooseTop(int top);
	
	abstract int chooseLeftAttributes(int left);
	
	abstract String chooseContent(String text);

	abstract JCheckBox createCheckBox();
	
	abstract JTextField createText();
	
	abstract JRadioButton createRadioButton();
	
	abstract JColorChooser createColorChooser();
}
