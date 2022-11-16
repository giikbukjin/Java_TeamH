package swing;

import javax.swing.JPanel;


import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class View2 extends JPanel implements ActionListener {

	/**
	 * 
	 * Create the panel.
	 * 
	 */

	public View2() {

		setLayout(null);

		JButton button1 = new JButton("검색");
		button1.setBounds(260, 340, 60, 40);
		
		JButton button2 = new JButton("추가");
		button2.setBounds(320, 340, 60, 40);
		
		JButton button3 = new JButton("삭제");
		button3.setBounds(380, 340, 60, 40);

		button1.setIcon(null);

		add(button1);
		add(button2);
		add(button3);

		JTextField textField = new JTextField();

		textField.setText(null);

		textField.setBackground(Color.WHITE);
		
		textField.setBounds(10, 340, 240, 40);

		add(textField);

	}

}