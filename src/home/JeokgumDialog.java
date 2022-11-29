package home;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import account.Account;
import mgr.Manageable;
import mgr.Manager;

public class JeokgumDialog extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;

	void Jeokgum(Account a) {
        setTitle("상품 상세보기");
        JPanel pane3 = new JPanel(new BorderLayout());
        pane3.setBackground(new Color(243, 246, 250));
        //Home h = new Home();
        
        setMinimumSize(new Dimension(465, 389)); // 대화상자 크기 설정
        setContentPane(pane3);
        
        JLabel lblNewLabel_2 = new JLabel("   " + a.saving + " )    " + a.bank+"  " + a.good);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 16));
		lblNewLabel_2.setBounds(132, 25, 287, 48);
		pane3.add(lblNewLabel_2);
		
		for(Manageable m: Manager.mList){
			 if(a == (Account)m)
			 matchesImage(a);
		 }
		
		JLabel lblNewLabel_2_1 = new JLabel("   " + a.num);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(132, 72, 287, 48);
		pane3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("     *  개설일");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2.setBounds(51, 138, 95, 40);
		pane3.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_3 = new JLabel(a.start);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(158, 138, 213, 40);
		pane3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("     *  만기일");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2_1.setBounds(51, 188, 95, 40);
		pane3.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel(a.expire);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(158, 188, 213, 40);
		pane3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("     *  이율");
		lblNewLabel_2_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2_2.setBounds(51, 238, 95, 40);
		pane3.add(lblNewLabel_2_2_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("" + a.rate + "%");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(158, 238, 213, 40);
		pane3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_2_2_3 = new JLabel("     *  월 납입액");
		lblNewLabel_2_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_3.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2_3.setBounds(51, 288, 109, 40);
		pane3.add(lblNewLabel_2_2_2_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("" + a.month);
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(168, 288, 203, 40);
		pane3.add(lblNewLabel_3_4);
	}
    
    public void showD(Account a) {
		Jeokgum(a);
		setVisible(true);
	}
    
    void matchesImage(Account a) {
    	if ((a.bank).equals("신한은행")) {
			 JLabel lblNewLabel_3_3 = new JLabel();
			 lblNewLabel_3_3.setIcon(new ImageIcon("./img/shinhan.PNG"));
			 lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
			 lblNewLabel_3_3.setBounds(25, 25, 95, 95);
			 add(lblNewLabel_3_3);
		 }
		 
		if ((a.bank).equals("하나은행")) {
			JLabel lblNewLabel_3_3 = new JLabel();
			lblNewLabel_3_3.setIcon(new ImageIcon("./img/hana.PNG"));
			lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_3.setBounds(25, 25, 95, 95);
			add(lblNewLabel_3_3);
		}
		 
		if ((a.bank).equals("우리종합금융")) {
				JLabel lblNewLabel_3 = new JLabel();
	            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel_3.setIcon(new ImageIcon("./img/woori.png"));
	            lblNewLabel_3.setBounds(25,25, 95, 95);
	            add(lblNewLabel_3);
			}
		if ((a.bank).equals("SBI저축은행")) {
				JLabel lblNewLabel_3 = new JLabel();
	            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	            lblNewLabel_3.setIcon(new ImageIcon("./img/SBI.png"));
	            lblNewLabel_3.setBounds(25,25, 95, 95);
	            add(lblNewLabel_3);
		}
		
		if ((a.bank).equals("토스뱅크")) {
			JLabel lblNewLabel_3 = new JLabel();
            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_3.setIcon(new ImageIcon("./img/toss.png"));
            lblNewLabel_3.setBounds(25,25, 95, 95);
            add(lblNewLabel_3);
		}
		
		if ((a.bank).equals("카카오뱅크")) {
			JLabel lblNewLabel_3 = new JLabel();
            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_3.setIcon(new ImageIcon("./img/kakao.png"));
            lblNewLabel_3.setBounds(25,25, 95, 95);
            add(lblNewLabel_3);
		}
		
		if ((a.bank).equals("광주은행")) {
			JLabel lblNewLabel_3 = new JLabel();
            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_3.setIcon(new ImageIcon("./img/jeonbuk.png"));
            lblNewLabel_3.setBounds(25,25, 95, 95);
            add(lblNewLabel_3);
		}
		if ((a.bank).equals("국민은행")) {
			JLabel lblNewLabel_3 = new JLabel();
            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_3.setIcon(new ImageIcon("./img/KB.png"));
            lblNewLabel_3.setBounds(25,25, 95, 95);
            add(lblNewLabel_3);
		}
	
		if ((a.bank).equals("기업은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/IBK.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}
	
		if ((a.bank).equals("농협은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/NH.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}
	
		if ((a.bank).equals("부산은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/busan.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}
	
		if ((a.bank).equals("수협은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/suhyup.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}
	
		if ((a.bank).equals("웰컴저축은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/welcome.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}
		if ((a.bank).equals("전북은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/jeonbuk.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}

		if ((a.bank).equals("제일은행")) {
			JLabel lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setIcon(new ImageIcon("./img/SC.png"));
			lblNewLabel_3.setBounds(25,25, 95, 95);
			add(lblNewLabel_3);
		}

		if ((a.bank).equals("제주은행")) {
			JLabel lblNewLabel_3 = new JLabel();
    		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
    		lblNewLabel_3.setIcon(new ImageIcon("./img/shinhan.png"));
    		lblNewLabel_3.setBounds(25,25, 95, 95);
    		add(lblNewLabel_3);
		}
    }
}
