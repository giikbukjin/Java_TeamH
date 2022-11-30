package calculate;

import javax.swing.*;
import javax.swing.border.LineBorder;

import account.Account;
import mgr.Manageable;
import mgr.Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculate extends JPanel {
	private static final long serialVersionUID = 1L;
	public ArrayList<Manageable> yList = new ArrayList<>();
	public ArrayList<Manageable> jList = new ArrayList<>();
	public ArrayList<Manageable> iList = new ArrayList<>();
	public ArrayList<String> jjList = new ArrayList<>();
	public ArrayList<Account> jjjList = new ArrayList<>();
	public JPanel panel_1 = new JPanel();
	public JLabel lblNewLabel = new JLabel();
	public JLabel lblNewLabel_1 = new JLabel();
	public JLabel lblNewLabel_1_1 = new JLabel();
	public JLabel lblNewLabel_3 = new JLabel();
	
	public Calculate() {
		setBackground(new Color(255, 255, 255));
		list();
		CalView();
	}

	public void list() {
		for (Manageable m : Manager.mList) {
			Account a = (Account) m;
			if (a.saving.equals("예금"))
				yList.add(a);
			if (a.saving.equals("적금"))
				jList.add(a);
			if (a.saving.equals("입출금"))
				iList.add(a);
		}
	}

	void CalView() {
    	setLayout(null);
		
		panel_1.setBorder(new LineBorder(new Color(210, 210, 210), 1, true));
		panel_1.setBackground(new Color(243, 246, 250));
		panel_1.setBounds(139, 36, 702, 369);
		add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"예금", "적금", "입출금"}));
		comboBox_1.setBounds(12, 10, 131, 34);
		comboBox_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		
		JComboBox<Account> comboBox = new JComboBox<Account>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(155, 11, 406, 33);
		
		comboBox_1.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent e) {
		            String cb = comboBox_1.getSelectedItem().toString();
		            panel_1.add(comboBox);
		            
		    		if(cb.equals("예금")) {
		    			for(Manageable m: yList) {
		    				Account a=(Account)m;
		    				comboBox.setModel(new DefaultComboBoxModel(new String[] {a.good + "     " + a.num}));
		    				comboBox.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
				    		//panel_1.add(comboBox);
				    		clear();
				    		setVisible(false);
				    		setInfo(a);
				    		setVisible(true);
				    		
		    			}
		    		}
		    		if(cb.equals("적금")) {
		    			for(Manageable m: jList) {
		    				Account a=(Account)m;
		    				jjList.add(a.good + "     " + a.num);
		    				jjjList.add(a);
		    				comboBox.setModel(new DefaultComboBoxModel(jjList.toArray(new String[jjList.size()])));
				    		comboBox.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
				    		//panel_1.add(comboBox);
				    		clear();
				    		setVisible(false);
				    		setInfo(a);
				    		setVisible(true);
		    			}
		    			
		    		}
		    		if(cb.equals("입출금")) {
		    			for(Manageable m: iList) {
		    				Account a=(Account)m;
		    				comboBox.setModel(new DefaultComboBoxModel(new String[] {a.good + "     " + a.num}));
				    		comboBox.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
				    		panel_1.add(comboBox);
				    		clear();
				    		setVisible(false);
				    		
				    		setInfo(a);
				    		setVisible(true);
		    			}
		    		}	
		       }
		});
		
		comboBox.addActionListener(new ActionListener() {
		       public void actionPerformed(ActionEvent e) {
		            String cb = comboBox.getSelectedItem().toString();
		            for (Manageable m: jList) {
		            	Account a = (Account)m;
		            	if (cb.contains(a.good)) {
		            		clear();
				    		setVisible(false);
				    		setInfo(a);
				    		setVisible(true);
				    		
		            	}
		            }
		       }
			});
		panel_1.add(comboBox_1);		
		
		JButton btnNewButton = new JButton("계산하기");
		btnNewButton.setBackground(new Color(232, 240, 249));
		btnNewButton.setBounds(573, 11, 115, 33);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
	}
		
	public void setInfo(Account a) {
		JLabel lblNewLabel_2_2 = new JLabel("     *  개설일");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(26, 128, 95, 48);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("     *  만기일");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_1.setBounds(26, 186, 95, 48);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("     *  금리");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_1_1.setBounds(26, 244, 95, 48);
		panel_1.add(lblNewLabel_2_2_1_1);
		
		lblNewLabel.setText(a.start);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel.setBounds(133, 128, 131, 48);
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1.setText(a.expire);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(133, 186, 131, 48);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_1_1.setText("연 " + a.rate);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(133, 244, 131, 48);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("+   잔고");
		lblNewLabel_2_2_2.setForeground(new Color(146, 174, 111));
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2.setBounds(400, 76, 95, 48);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("+   이자");
		lblNewLabel_2_2_2_1.setForeground(new Color(146, 174, 111));
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2_1.setBounds(400, 134, 95, 48);
		panel_1.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("-   세금(#.##%)");
		lblNewLabel_2_2_2_2.setForeground(new Color(208, 115, 162));
		lblNewLabel_2_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2_2.setBounds(400, 192, 129, 48);
		panel_1.add(lblNewLabel_2_2_2_2);
		
		lblNewLabel_3.setText(""+a.asset);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(491, 76, 151, 48);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("(이자 계산)");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(491, 134, 151, 48);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("(세금 계산)");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(491, 192, 151, 48);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("______________________________________________");
		lblNewLabel_4.setFont(new Font("새굴림", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(381, 250, 287, 15);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("(수령액 계산)");
		lblNewLabel_3_1_1.setForeground(new Color(131, 165, 207));
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(491, 282, 151, 48);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("=   수령액");
		lblNewLabel_2_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2_1_1.setBounds(400, 282, 95, 48);
		panel_1.add(lblNewLabel_2_2_2_1_1);
		
	}
	
	public void clear() {
		lblNewLabel.setText("");
		lblNewLabel_1.setText("");
		lblNewLabel_1_1.setText("");
		lblNewLabel_3.setText("");
	}
	
	public void comboMatch() {
	}
}