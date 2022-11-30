package recommend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class RcmdItemModel extends JPanel {
	private static final long serialVersionUID = 1L;

	public RcmdItemModel(RcmdItem ri) {
		createModel(ri);
	}

	public void createModel(RcmdItem ri) {
		//JPanel panel_1 = new JPanel();
		setPreferredSize(new Dimension(376, 350)); // 대화상자 크기 설정
		
		setBackground(new Color(244, 244, 244));
		setBounds(22, 60, 376, 350);
		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel(); //로고
		lblNewLabel.setText("");
		matchImage(ri, lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(25, 25, 95, 95);
		add(lblNewLabel);
		
		JPanel panel_2_2_1 = new JPanel(); 
		panel_2_2_1.setBounds(120, 55, 62, 30);
		add(panel_2_2_1);
		panel_2_2_1.setBackground(new Color(255, 255, 255));
		panel_2_2_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel(ri.saving); //금융권
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2_1.add(lblNewLabel_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(120, 90, 62, 30);
		panel_2_2.setBackground(new Color(255, 255, 255));
		panel_2_2.setLayout(new BorderLayout(0, 0));
		add(panel_2_2);
		
		JLabel lblNewLabel_2 = new JLabel(ri.fc); //상품종류
		lblNewLabel_2.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel(); //인덱스
		panel_2_1.setBounds(182, 55, 19, 30);
		add(panel_2_1);
		panel_2_1.setBackground(new Color(191, 230, 253));
		
		JPanel panel_2 = new JPanel(); //인덱스
		panel_2.setBounds(182, 90, 19, 30);
		add(panel_2);
		panel_2.setBackground(new Color(173, 251, 132));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(25, 152, 157, 49);
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(new BorderLayout(0, 0));
		add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel(ri.bank); //은행이름
		lblNewLabel_4.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4, BorderLayout.CENTER);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBounds(25, 211, 157, 49);
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setLayout(new BorderLayout(0, 0));
		add(panel_4_1);
		
		JLabel lblNewLabel_4_1 = new JLabel(""+ri.rate); //이율
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		panel_4_1.add(lblNewLabel_4_1, BorderLayout.CENTER);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(25, 270, 157, 49);
		panel_4_2.setBackground(Color.WHITE);
		panel_4_2.setLayout(new BorderLayout(0, 0));
		add(panel_4_2);
		
		DecimalFormat decFormat = new DecimalFormat("###,###");
		String str = decFormat.format(ri.limit);
		JLabel lblNewLabel_4_2_3 = new JLabel(str + "원"); //한도금액
		lblNewLabel_4_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_3.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		panel_4_2.add(lblNewLabel_4_2_3, BorderLayout.CENTER);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBounds(194, 152, 157, 49);
		panel_4_3.setBackground(Color.WHITE);
		panel_4_3.setLayout(new BorderLayout(0, 0));
		add(panel_4_3);
		
		JLabel lblNewLabel_4_2 = new JLabel(ri.ItemName); //상품이름
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		panel_4_3.add(lblNewLabel_4_2, BorderLayout.CENTER);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBounds(194, 211, 157, 49);
		panel_4_4.setBackground(Color.WHITE);
		panel_4_4.setLayout(new BorderLayout(0, 0));
		add(panel_4_4);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("" + ri.month + "개월"); //개월수
		lblNewLabel_4_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2_1.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
		panel_4_4.add(lblNewLabel_4_2_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("상품 선택");
		btnNewButton.setBounds(225, 284, 95, 23);
		add(btnNewButton);
		
		//add(panel_1);
	}

	public void matchImage(RcmdItem ri, JLabel a) {
		if ((ri.bank).equals("우리종합금융")) {
			ImageIcon ii = new ImageIcon("./img/woori.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("SBI저축은행")) {
			ImageIcon ii = new ImageIcon("./img/SBI.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("신한은행")) {
			ImageIcon ii = new ImageIcon("./img/shinhan.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("광주은행")) {
			ImageIcon ii = new ImageIcon("./img/jeonbuk.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("국민은행")) {
			ImageIcon ii = new ImageIcon("./img/KB.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("기업은행")) {
			ImageIcon ii = new ImageIcon("./img/IBK.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("농협은행")) {
			ImageIcon ii = new ImageIcon("./img/NH.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("부산은행")) {
			ImageIcon ii = new ImageIcon("./img/busan.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("수협은행")) {
			ImageIcon ii = new ImageIcon("./img/suhyup.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("웰컴저축은행")) {
			ImageIcon ii = new ImageIcon("./img/welcome.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("전북은행")) {
			ImageIcon ii = new ImageIcon("./img/jeonbuk.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("제일은행")) {
			ImageIcon ii = new ImageIcon("./img/SC.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("제주은행")) {
			ImageIcon ii = new ImageIcon("./img/shinhan.png");
			ii = imageSetSize(ii, 95, 95);
			a.setIcon(ii);
		}
		if ((ri.bank).equals("하나은행")) {
			ImageIcon ii = new ImageIcon("./img/hana.png");
			ii = imageSetSize(ii, 95, 95);
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
		add(j);
	}
}