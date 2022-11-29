package calculate;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

public class Calculate extends JPanel{
	private static final long serialVersionUID = 1L;

    public Calculate() {
    	setBackground(new Color(255, 255, 255));
        CalView();
    }

    void CalView() {
    	setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(210, 210, 210), 1, true));
		panel_1.setBackground(new Color(243, 246, 250));
		panel_1.setBounds(139, 36, 702, 369);
		add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setForeground(new Color(0, 0, 0));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"    예금", "    적금", "    입출금"}));
		comboBox_1.setBounds(12, 10, 131, 34);
		comboBox_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		panel_1.add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(155, 11, 406, 33);
		panel_1.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"    상품명   계좌번호", "    2", "    3"}));
		comboBox.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("계산하기");
		btnNewButton.setBackground(new Color(232, 240, 249));
		btnNewButton.setBounds(573, 11, 115, 33);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		
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
		
		JLabel lblNewLabel = new JLabel("2021/10/06");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel.setBounds(133, 128, 131, 48);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2023/03/15");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(133, 186, 131, 48);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("연 2.3%");
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
		
		JLabel lblNewLabel_3 = new JLabel("1,500,000");
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
}