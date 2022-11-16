package swing;

import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class View3 extends JPanel {

	/**
	 * 
	 * Create the panel.
	 * 
	 */

	public View3() {

		setLayout(null);

		JButton button1 = new JButton("추천");
		button1.setBounds(320, 200, 100, 60);

		button1.setIcon(null);

		add(button1);
		


	}

}