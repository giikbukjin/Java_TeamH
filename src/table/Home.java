package table;

import javax.swing.JPanel;
<<<<<<< HEAD

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
=======
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Home extends JPanel{

>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b
    public Home() {
        HomeView();
    }

    void HomeView() {
        setLayout(new BorderLayout(0,0));
<<<<<<< HEAD
        JButton button = new JButton("");
        button.setIcon(new ImageIcon("shinhan.jpg"));
=======

        JButton button = new JButton("");
        button.setIcon(new ImageIcon("./img/shinhan.PNG"));
>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b
        add(button, BorderLayout.CENTER);
    }
}