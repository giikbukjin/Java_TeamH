package recommend;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class RcmdItemMgr extends JPanel {
	GridBagLayout Gbag = new GridBagLayout();
	int count = 1;
	Recommend rec = new Recommend();
	String cA = Recommend.kwd1;
	String aA = Recommend.kwd2;
	static int rcmdNum = 0; //추천 상품 개수. 텍스트에 집어넣어야 함
	
	private static final long serialVersionUID = 1L;
	
	public RcmdItemMgr() {
		view();
	}

	private Manager mgr = new Manager();

	public void view() {
		mgr.readAll2("./txt/recommend.txt", new Factory() {
			public Manageable create() {
				return new RcmdItem();
			}
		});
		setLayout(Gbag);

		for (Manageable m : Manager.rList) {
			RcmdItem r = (RcmdItem) m;
			if(recMatch(r)) {
				RcmdItemModel md = new RcmdItemModel(r);
				this.create_form(md, (count++ * 30), 0, 30, 10);
				rcmdNum++;
			}
		}
	}

	public void create_form(Component cmpt, int x, int y, int w, int h) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		this.Gbag.setConstraints(cmpt, gbc);
		add(cmpt);
		updateUI();
	}
	
public boolean recMatch(RcmdItem r) {
		if (Integer.parseInt(aA) >= 
				(Integer.parseInt(cA) / r.month) + (Integer.parseInt(cA) / 1000)) {
			if ((r.saving).equals("적금")) {
				return true;
			}
			else return false;
		}
		else {
			if ((r.saving).equals("예금")) {
				return true;
			}
			else return false;
		}
	}
}