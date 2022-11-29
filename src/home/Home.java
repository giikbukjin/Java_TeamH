package home;

import account.Account;
import mgr.Manageable;
import mgr.Manager;
import recommend.RcmdItem;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Home extends JPanel{
	private static final long serialVersionUID = 1L;

    public Home() {
        HomeView();
    }

    int count=1;
    void HomeView() {
        setLayout(null);
        
        for(Manageable m: Manager.mList){
        	Account a = (Account)m;
        	//matchesImage(a);  
        	
        	JLabel lblNewLabel_3 = new JLabel();
            lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
            matchesImage(a,lblNewLabel_3);
            lblNewLabel_3.setBounds(30, (count * 100) - 70, 95, 95);
            add(lblNewLabel_3);
           
            JButton btnNewButton = new JButton(a.saving + "          " + a.bank + "          " + a.num);
            btnNewButton.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 17));
            btnNewButton.setBounds(142, (count * 100) - 60, 807, 70);
            btnNewButton.setBackground(new Color(243, 246, 250));
            btnNewButton.setBorder(new LineBorder(new Color(210, 210, 210), 1, true));
            add(btnNewButton);

            btnNewButton.addActionListener(new ActionListener() {
               @Override
                public void actionPerformed(ActionEvent e) {
                	checkD(a);
                }
            });
            count++;
        }
    }
    
    void matchesImage(Account a, JLabel lblNewLabel_3) {
		if ((a.bank).equals("우리종합금융")) {
			lblNewLabel_3.setIcon(new ImageIcon("./img/woori.png"));          
		}
		if ((a.bank).equals("SBI저축은행")) {
			lblNewLabel_3.setIcon(new ImageIcon("./img/SBI.png"));
		}
		if ((a.bank).equals("신한은행")) {
			lblNewLabel_3.setIcon(new ImageIcon("./img/shinhan.png"));
		}
		if ((a.bank).equals("광주은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/jeonbuk.png"));
		}
		if ((a.bank).equals("국민은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/KB.png"));
		}
		if ((a.bank).equals("기업은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/IBK.png"));
		}
		if ((a.bank).equals("농협은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/NH.png"));
		}
		if ((a.bank).equals("부산은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/busan.png"));
		}
		if ((a.bank).equals("수협은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/suhyup.png"));
		}
		if ((a.bank).equals("웰컴저축은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/welcome.png"));
		}
		if ((a.bank).equals("전북은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/jeonbuk.png"));
		}
		if ((a.bank).equals("제일은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/SC.png"));
		}
		if ((a.bank).equals("제주은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/shinhan.png"));
		}
		if ((a.bank).equals("하나은행")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/hana.png"));
		}
		if ((a.bank).equals("카카오뱅크")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/kakao.png"));
		}
		if ((a.bank).equals("토스뱅크")) {
            lblNewLabel_3.setIcon(new ImageIcon("./img/toss.png"));
		}
	}
    
    public void checkD(Account a) {
    	if ((a.saving).equals("예금")) {
    		new YegumDialog().showD(a);
    	}
    	
    	if ((a.saving).equals("적금")) {
    		new JeokgumDialog().showD(a);
    	}
    	
    	if ((a.saving).equals("입출금")) {
    		new IpchulgumDialog().showD(a);
    	}
    }
}