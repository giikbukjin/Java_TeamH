package table;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public MyFrame(String title) {
        createFrame(title);
        JTabbedPane pane = createTabbedPane();
        this.add(pane, BorderLayout.CENTER);
    }

    void createFrame(String title) {
        this.setTitle(title);
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }

    public JTabbedPane createTabbedPane() {
        JTabbedPane pane = new JTabbedPane();
        TableSelectionDemo newContentPane = new TableSelectionDemo();
        newContentPane.addComponentsToPane();

        pane.addTab("홈 이미지", new Home());
        pane.addTab("자산", newContentPane);
        return pane;
    }
}