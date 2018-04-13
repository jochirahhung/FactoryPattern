package main.app;

import javax.swing.JComponent;


public class Driver extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7720361932620321997L;

	public static void main(String[] args) {
		IDEBuilder ide = new IDEBuilder();
		ide.widget();
	}
	
} 
