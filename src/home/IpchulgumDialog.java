package home;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import account.Account;

public class IpchulgumDialog extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;

	void Ipchulgum(Account a) {
        setTitle("상품 상세보기");
        JPanel pane1 = new JPanel(new BorderLayout());
        pane1.setBackground(new Color(243, 246, 250));
        Home h = new Home();
        setMinimumSize(new Dimension(465, 389)); // 대화상자 크기 설정
        setContentPane(pane1);
        
        JLabel lblNewLabel_2 = new JLabel("   " + a.saving + " )    " + a.bank + "  " + a.good);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 16));
		lblNewLabel_2.setBounds(132, 25, 287, 48);
		pane1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_3 = new JLabel();
		h.matchesImage(a, lblNewLabel_3_3);
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(25, 25, 95, 95);
		pane1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("   " + a.num);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(132, 72, 287, 48);
		pane1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("     *  이율");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_1.setBounds(51, 233, 95, 48);
		pane1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("" + a.rate + "%");
		lblNewLabel_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(158, 233, 213, 48);
		pane1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("     *  개설일");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 15));
		lblNewLabel_2_2_2.setBounds(51, 175, 95, 48);
		pane1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel(a.start);
		lblNewLabel_3_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setBounds(158, 175, 213, 48);
		pane1.add(lblNewLabel_3_1);
    }
    
    public void showD(Account a) {
		Ipchulgum(a);
		setVisible(true);
	}
}
