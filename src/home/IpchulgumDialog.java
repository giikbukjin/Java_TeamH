package home;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import recommend.RcmdItemScroll;

public class IpchulgumDialog extends javax.swing.JDialog {
    void Ipchulgum() {
        setTitle("상품 상세보기");
        JPanel pane1 = new JPanel(new BorderLayout());

        setMinimumSize(new Dimension(465, 389)); // 대화상자 크기 설정
        setContentPane(pane1);
        
        JLabel lblNewLabel_2 = new JLabel("   입출금 )    토스뱅크    토스뱅크 통장");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(132, 25, 287, 48);
		pane1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_3 = new JLabel();
		lblNewLabel_3_3.setIcon(new ImageIcon("./img/shinhan.PNG"));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(25, 25, 95, 95);
		pane1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("   1000-0014-8942");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(132, 72, 287, 48);
		pane1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("     *  금리");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(51, 233, 95, 48);
		pane1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("5.00%");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(158, 233, 213, 48);
		pane1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("     *  개설일");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(51, 175, 95, 48);
		pane1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("2021/12/17");
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setBounds(158, 175, 213, 48);
		pane1.add(lblNewLabel_3_1);
    }
    
    public void showIpchulgum() {
		IpchulgumDialog info = new IpchulgumDialog();
		info.Ipchulgum();
		info.setVisible(true);
	}
}
