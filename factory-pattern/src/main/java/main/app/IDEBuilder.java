package main.app;

import java.awt.BorderLayout;

import javax.swing.*;

public class IDEBuilder {
	
	public void widget() {
		JPanel panel = new JPanel(new BorderLayout());
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField text = new JTextField();
		JPanel outerPanel = new JPanel();
		JColorChooser button1 = new JColorChooser();
		text.setColumns(8);
		
		panel.add(text, BorderLayout.CENTER);
		panel.add(button1, BorderLayout.AFTER_LAST_LINE);
		outerPanel.add(panel, BorderLayout.BEFORE_FIRST_LINE);
		
		window.add(outerPanel);
		window.setSize(1000, 1000);
		window.setVisible(true);

	}
}
