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
    private static final long serialVersionUID = 1L;

    public RcmdItemMgr() {
        view();
    }

    private Manager mgr = new Manager();
    /*
     * public void readAll(String filename) { mgr.readAll("recommend.txt", new
     * Factory() { public Manageable create() { return new RcmdItem(); } }); }
     */

    public void view() {
        mgr.readAll("recommend.txt", new Factory() {
            public Manageable create() {
                return new RcmdItem();
            }
        });
        setLayout(Gbag);
        //JScrollPane scroll = new JScrollPane(this);
        //scroll.setBounds(0, 0, 160, 160);
        //create_form(new JLabel(), 0, 0, 0, 0);

        for (Manageable m : mgr.mList) {
            RcmdItem r = (RcmdItem) m;
            RcmdItemModel md = new RcmdItemModel(r);
            //add(md);
            this.create_form(md, 0, count++*30, 30, 10);
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
}
