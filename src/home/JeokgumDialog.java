package home;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JeokgumDialog extends javax.swing.JDialog {
    void Jeokgum() {
        setTitle("상품 상세보기");
        JPanel pane3 = new JPanel(new BorderLayout());

        setMinimumSize(new Dimension(465, 389)); // 대화상자 크기 설정
        setContentPane(pane3);
        
        JLabel lblNewLabel_2 = new JLabel("   적금 )    신한    신한 쏠메이트     ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(132, 25, 287, 48);
		pane3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("로고");
		lblNewLabel_3_3.setIcon(new ImageIcon("C:\\Users\\정진서\\Desktop\\shinhan.PNG"));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(25, 25, 95, 95);
		pane3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("   110-510-493476");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(132, 72, 287, 48);
		pane3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("     *  개설일");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(51, 138, 95, 40);
		pane3.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("2022/07/25");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(158, 138, 213, 40);
		pane3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("     *  만기일");
		lblNewLabel_2_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_2_1.setBounds(51, 188, 95, 40);
		pane3.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("2023/07/25");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(158, 188, 213, 40);
		pane3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("     *  이율");
		lblNewLabel_2_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_2_2.setBounds(51, 238, 95, 40);
		pane3.add(lblNewLabel_2_2_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("7.00%");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(158, 238, 213, 40);
		pane3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_2_2_3 = new JLabel("     *  월 납입액");
		lblNewLabel_2_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_2_3.setBounds(51, 288, 109, 40);
		pane3.add(lblNewLabel_2_2_2_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("300,000");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(168, 288, 203, 40);
		pane3.add(lblNewLabel_3_4);
	}
    
    public void showJeokgum() {
    	JeokgumDialog info = new JeokgumDialog();
		info.Jeokgum();
		info.setVisible(true);
	}
}
