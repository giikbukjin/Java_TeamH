package table;

import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Home extends JPanel{
	

	/**
	 * 
	 * Create the panel.
	 * 
	 */
	
	public Home() {
		HomeView();
	}

	void HomeView() {
		
		setLayout(new BorderLayout(0,0));

		JButton button = new JButton("");

		button.setIcon(new ImageIcon("C:\\Users\\shinx\\Desktop\\BankSwing\\shinhan.jpg"));
		add(button, BorderLayout.CENTER);

		
		
		
	}

}