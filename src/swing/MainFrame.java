package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainFrame extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;

	JPanel panel;
	View1 v1 = new View1();
	View2 v2 = new View2();
	View3 v3 = new View3();
	View4 v4 = new View4();
	CardLayout card = new CardLayout();

	/**
	 * 
	 * Launch the application.
	 * 
	 */

/**

  * Create the frame.

  */

public MainFrame() {
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setBounds(100, 100, 488, 495);
     contentPane = new JPanel();
     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
     setContentPane(contentPane);
     contentPane.setLayout(null);

     panel = new JPanel();
     panel.setLayout(card);
     panel.add("view1", v1);  //화면에 이름붙임.
     panel.add("view2", v2);
     panel.add("view3", v3);
     panel.add("view4", v4);
     card.show(panel, "view1");  //실행하자 마자 보이는

     panel.setBounds(12, 55, 448, 392);
     contentPane.add(panel);

     b1 = new JButton("홈");
     b1.setBounds(12, 10, 97, 35);
     contentPane.add(b1);

     b2 = new JButton("자산");
     b2.setBounds(121, 10, 97, 35);
     contentPane.add(b2);

     b3 = new JButton("수령액");
     b3.setBounds(230, 10, 97, 35);
     contentPane.add(b3);
     
     b4 = new JButton("상품추천");
     b4.setBounds(339, 10, 97, 35);
     contentPane.add(b4);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);

     setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == b1) {
			card.show(panel, "view1");
		} else if (ob == b2) {
			card.show(panel, "view2");
		} else if (ob == b3) {
			card.show(panel, "view3");
		} else if (ob == b4) {
			card.show(panel, "view4");
		}
	}
}