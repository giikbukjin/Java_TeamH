package home;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class YegumDialog extends javax.swing.JDialog {
	 void Yegum() {
        setTitle("상품 상세보기");
        JPanel pane2 = new JPanel(new BorderLayout());

        setMinimumSize(new Dimension(465, 389)); // 대화상자 크기 설정
        setContentPane(pane2);
        
        JLabel lblNewLabel_2 = new JLabel("   예금 )    하나은행    하나의 정기예금");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(132, 25, 287, 48);
		pane2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("로고");
		lblNewLabel_3_3.setIcon(new ImageIcon("C:\\Users\\정진서\\Desktop\\shinhan.PNG"));
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(25, 25, 95, 95);
		pane2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("   9522-12154-63321");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(132, 72, 287, 48);
		pane2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("     *  만료일");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(51, 205, 95, 48);
		pane2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("     *  금리");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(51, 263, 95, 48);
		pane2.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel = new JLabel("2028/08/05");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(158, 205, 213, 48);
		pane2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("5.00%");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(158, 263, 213, 48);
		pane2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("     *  개설일");
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_2_2.setBounds(51, 147, 95, 48);
		pane2.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("2021/10/06");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(158, 147, 213, 48);
		pane2.add(lblNewLabel_3);
	}
	 
	public void showYegum() {
		YegumDialog info = new YegumDialog();
		info.Yegum();
		info.setVisible(true);
	}
}
