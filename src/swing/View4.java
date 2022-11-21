package swing;

import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class View4 extends JPanel {

	/**
	 * 
	 * Create the panel.
	 * 
	 */

	public View4() {
		/*setLayout(new BorderLayout(0, 0));
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(null);
		add(btnNewButton, BorderLayout.CENTER);

		JTextArea textArea = new JTextArea();
		textArea.setText(null);
		textArea.setBackground(Color.PINK);
		add(textArea, BorderLayout.SOUTH);*/

		JButton button1 = new JButton("추천");
		button1.setBounds(320, 200, 100, 60);
		button1.setIcon(null);
		add(button1);
	}
}