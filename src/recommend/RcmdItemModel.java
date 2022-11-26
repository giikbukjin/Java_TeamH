package recommend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import table.GUIMain;

public class RcmdItemModel extends JPanel {

    /**
     *
     */
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
        add(new JLabel(ri.saving));
        add(new JLabel(ri.bank));
        add(new JLabel(ri.ItemName));
        add(new JLabel("" + ri.rate));
        add(new JLabel("" + ri.month));
        add(new JLabel("" + ri.limit));
        add(new JLabel(ri.fc));
        this.setBorder(new LineBorder(Color.blue));

    }

    public void matchImage(RcmdItem ri, JLabel a) {
        if ((ri.bank).equals("우리종합금융")) {
            ImageIcon ii = new ImageIcon("C:\\uri.png");
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

}
