package recommend;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class RcmdItemScroll extends JPanel{

    JPanel rcmdpane = new RcmdItemMgr();
    public JScrollPane scroll = new JScrollPane(rcmdpane);


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public RcmdItemScroll() {
        view();
    }

    public void view() {
        scroll.setBounds(0, 0, 160, 160);

    }


}
