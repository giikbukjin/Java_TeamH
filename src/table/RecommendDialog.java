package table;

import javax.swing.JPanel;
import recommend.RcmdItemScroll;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class RecommendDialog extends javax.swing.JDialog {

    void setup() {
        setTitle("상품 상세보기");
        JPanel pane = new JPanel(new BorderLayout());
        JPanel lpane = new JPanel(new BorderLayout());

        TableSelectionDemo newContentPane = new TableSelectionDemo();
        newContentPane.addComponentsToPane();
        RcmdItemScroll rimContentPane = new RcmdItemScroll();

        lpane.add(rimContentPane.scroll);
        pane.add(lpane, BorderLayout.CENTER);

        this.setMinimumSize(new Dimension(800, 500)); // 대화상자 크기 설정
        setContentPane(pane);
    }
}
