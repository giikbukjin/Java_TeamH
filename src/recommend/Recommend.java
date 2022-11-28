package recommend;

import javax.swing.JPanel;

import javax.swing.JTextField;
import account.Account;
import table.TableSelectionDemo;

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
		userLabel.setBounds(80, 190, 80, 25);
		add(userLabel);

		JLabel passLabel = new JLabel("저축가능액");
		passLabel.setBounds(70, 240, 80, 25);
		add(passLabel);
		kwdTextField1.setText(null);
		kwdTextField2.setText(null);
		kwdTextField1.setBounds(160, 180, 240, 40);
		kwdTextField2.setBounds(160, 230, 240, 40);
		add(kwdTextField1);
		add(kwdTextField2);
		JButton recommend = new JButton("상품 추천");
		recommend.setBounds(430, 190, 90, 70);
		add(recommend);
		//JFrame jf = new JFrame();
		//JDialog rd = new RcmdItemDialog(jf, "rec");
		
		//run();

		recommend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("상품 추천")) {
					kwd1 = kwdTextField1.getText();
					kwd2 = kwdTextField2.getText();
					tableDemo.showRecommend();
				}
				/*if (e.getActionCommand().equals("상품 추천")) {
					rim.view();
				}*/
			}
		});
	}
}