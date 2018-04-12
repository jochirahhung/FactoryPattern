package main.app;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Driver extends JComponent{

	public static void main(String[] args) {
		JPanel panel = new JPanel(new BorderLayout());
		builder(panel);
	}
	
	public static void builder(JPanel panel) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField();
		JPanel outerPanel = new JPanel();
		JRadioButton button1 = new JRadioButton("Just A Test");
		text.setColumns(8);
		
		panel.add(text, BorderLayout.CENTER);
		panel.add(button1, BorderLayout.AFTER_LAST_LINE);
		outerPanel.add(panel, BorderLayout.BEFORE_FIRST_LINE);
		
		window.add(outerPanel);
		window.setSize(300, 200);
		window.setVisible(true);
	}

} 
