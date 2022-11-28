package recommend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class RcmdItemModel extends JPanel {
	private static final long serialVersionUID = 1L;

	public RcmdItemModel(RcmdItem ri) {
		createModel(ri);
	}

	public void createModel(RcmdItem ri) {
		// contentPane.add(model);
		GridLayout layout = new GridLayout(4, 2, 10, 10);
		setLayout(layout);
		setPreferredSize(new Dimension(500, 500));
		JLabel a = new JLabel();
		matchImage(ri, a);
		a.setBorder(new LineBorder(Color.blue));
		add(a);
		JLabel b = new JLabel(ri.saving);
		setting(b);
		JLabel c = new JLabel(ri.bank);
		setting(c);
		JLabel d = new JLabel(ri.ItemName);
		setting(d);
		JLabel e = new JLabel("" + ri.rate);
		setting(e);
		JLabel f = new JLabel("" + ri.month);
		setting(f);
		JLabel g = new JLabel("" + ri.limit);
		setting(g);
		JLabel h = new JLabel(ri.fc);
		setting(h);
		this.setBorder(new LineBorder(Color.blue));

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
		add(j);
		j.setBorder(new LineBorder(Color.blue));
	}
}