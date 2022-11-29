package recommend;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import account.Account;
import table.TableSelectionDemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Recommend extends JPanel {
	private static final long serialVersionUID = 1L;
	ArrayList<Account> aList = new ArrayList<>();
	JTextField kwdTextField1 = new JTextField();
	JTextField kwdTextField2 = new JTextField();
	public static String kwd1;
	public static String kwd2;
	String title;
	
	void run() {
		readAll("./txt/account.txt");
	}

	void readAll(String filename) {
		Scanner filein = openFile(filename);
		Account ac = null;
		while (filein.hasNext()) {
			ac = new Account();
			ac.read(filein);
			aList.add(ac);
		}
	}

	Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.printf("파일 오픈 실패: %s\n", filename);
			System.exit(0);
		}
		return filein;
	}

	public Recommend() {
		RecommendView();
	}
	
	public Recommend(String title) {
		this.title = title;
	}
	
	public String getkwd1() {
		return kwdTextField1.getText();
	}
	
	public String getkwd2() {
		return kwdTextField2.getText();
	}

	public void RecommendView() {
		TableSelectionDemo tableDemo = new TableSelectionDemo();
		setLayout(null);
		JLabel userLabel = new JLabel("보유현금");
		userLabel.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		userLabel.setBounds(100, 190, 80, 25);
		add(userLabel);

		JLabel passLabel = new JLabel("저축가능액");
		passLabel.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		passLabel.setBounds(90, 240, 80, 25);
		add(passLabel);
		kwdTextField1.setText(null);
		kwdTextField2.setText(null);
		kwdTextField1.setBounds(180, 180, 240, 40);
		kwdTextField1.setBorder(new LineBorder(new Color(210, 210, 210), 1, true));
		kwdTextField2.setBounds(180, 230, 240, 40);
		kwdTextField2.setBorder(new LineBorder(new Color(210, 210, 210), 1, true));
		add(kwdTextField1);
		add(kwdTextField2);
		
		JButton recommend = new JButton("상품 추천");
		recommend.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		recommend.setBorder(new LineBorder(new Color(210, 210, 210), 1, true));
		recommend.setBackground(new Color(232, 240, 249));
		recommend.setBounds(450, 190, 100, 70);
		add(recommend);

		recommend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("상품 추천")) {
					kwd1 = kwdTextField1.getText();
					kwd2 = kwdTextField2.getText();
					tableDemo.showRecommend();
				}
			}
		});
	}
}