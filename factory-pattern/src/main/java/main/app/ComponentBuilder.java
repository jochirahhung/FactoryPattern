package main.app;

import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ComponentBuilder extends ComponentFactory {

	@Override
	int chooseHeight(int height) {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	int chooseWidth(int width) {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	int chooseTop(int top) {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	int chooseLeftAttributes(int left) {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	String chooseContent(String text) {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	JCheckBox createCheckBox() {
		JCheckBox checkBox = new JCheckBox("I am a check box");
		return checkBox;
	}

	@Override
	JTextField createText() {
		JTextField textBox = new JTextField(8);
		return textBox;
	}

	@Override
	JRadioButton createRadioButton() {
		JRadioButton radioButton = new JRadioButton("I am a Radio Button");
		return radioButton;
	}

	@Override
	JColorChooser createColorChooser() {
		JColorChooser color = new JColorChooser();
		return color;
	}

}
 