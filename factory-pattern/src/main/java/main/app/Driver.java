package main.app;

import java.awt.BorderLayout;

import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Driver extends JComponent{

	public static void main(String[] args) {
		IDEBuilder ide = new IDEBuilder();
		ide.widget();
	}
	
} 
