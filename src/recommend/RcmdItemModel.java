package recommend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class RcmdItemModel extends javax.swing.JDialog {
	private static final long serialVersionUID = 1L;

	public RcmdItemModel(RcmdItem ri) {
		createModel(ri);
	}

	public void createModel(RcmdItem ri) {
		JPanel panel_1 = new JPanel();
        setMinimumSize(new Dimension(800, 450)); // 대화상자 크기 설정
        setContentPane(panel_1);
		
		panel_1.setBackground(new Color(244, 244, 244));
		panel_1.setBounds(22, 60, 350, 337);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel(); //로고
		matchImage(ri, lblNewLabel_3);
		lblNewLabel_3.setBounds(34, 69, 95, 95);
		add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\정진서\\Desktop\\shinhan.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2_2_1 = new JPanel(); 
		panel_2_2_1.setBounds(129, 99, 62, 30);
		panel_1.add(panel_2_2_1);
		panel_2_2_1.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3_1_1 = new JLabel(ri.saving); //금융권
		setting(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_3_1_1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel_3_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(129, 134, 62, 30);
		panel_1.add(panel_2_2);
		panel_2_2.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3_1 = new JLabel(ri.fc); //상품종류
		setting(lblNewLabel_3_1);
		add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(191, 99, 19, 30);
		panel_1.add(panel_2_1);
		panel_2_1.setBackground(new Color(191, 230, 253));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(191, 134, 19, 30);
		panel_1.add(panel_2);
		panel_2.setBackground(new Color(173, 251, 132));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(34, 196, 157, 49);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel(ri.bank); //은행이름
		setting(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(34, 255, 157, 49);
		panel_1.add(panel_4_1);
		panel_4_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("" + ri.rate + "%"); //이율
		setting(lblNewLabel_4_1);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		panel_4_1.add(lblNewLabel_4_1, BorderLayout.CENTER);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setBounds(34, 314, 157, 49);
		panel_1.add(panel_4_2);
		panel_4_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_2_3 = new JLabel("" + ri.limit + "원"); //한도금액
		setting(lblNewLabel_4_2_3);
		lblNewLabel_4_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_3.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		panel_4_2.add(lblNewLabel_4_2_3, BorderLayout.CENTER);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setBounds(203, 196, 157, 49);
		panel_1.add(panel_4_3);
		panel_4_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_2 = new JLabel(ri.ItemName); //상품이름
		setting(lblNewLabel_4_2);
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		panel_4_3.add(lblNewLabel_4_2, BorderLayout.CENTER);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBackground(Color.WHITE);
		panel_4_4.setBounds(203, 255, 157, 49);
		panel_1.add(panel_4_4);
		panel_4_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4_2_1 = new JLabel("" + ri.month + "개월"); //상품개월수
		setting(lblNewLabel_4_2_1);
		lblNewLabel_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 12));
		panel_4_4.add(lblNewLabel_4_2_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("상품 선택");
		btnNewButton.setBounds(234, 328, 95, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("(사용자 이름)님을 위한 (n)개의 상품이 추천되었습니다.");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setBounds(22, 10, 391, 40);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 14));
	}

	public void matchImage(RcmdItem ri, JLabel a) {
		if ((ri.bank).equals("우리종합금융")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\우리종합금융.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("SBI저축은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\sbi저축은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("신한은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\shinhan.jpg");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("광주은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\광주은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("국민은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\국민은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("기업은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\기업은행.jpg");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("농협은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\농협은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("부산은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\부산은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("수협은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\수협은행.jpg");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("웰컴저축은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\웰컴저축은행.jpg");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("전북은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\전북은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("제일은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\제일은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("제주은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\제주은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("하나은행")) {
			ImageIcon ii = new ImageIcon("C:\\Users\\shinx\\Desktop\\bankimage\\하나은행.png");
			ii = imageSetSize(ii, 100, 100);
			a.setIcon(ii);
		}
	}

	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}
	
	void setting(JLabel j) {
		getContentPane().add(j);
	}
}