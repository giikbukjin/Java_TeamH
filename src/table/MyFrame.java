package table;

import java.awt.BorderLayout;
<<<<<<< HEAD

=======
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
<<<<<<< HEAD
=======
import javax.swing.SwingConstants;
>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public MyFrame(String title) {
        createFrame(title);
        JTabbedPane pane = createTabbedPane();
        this.add(pane, BorderLayout.CENTER);
    }

    void createFrame(String title) {
<<<<<<< HEAD
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
=======
        Dimension dim = new Dimension(1024, 600);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setPreferredSize(dim);
    }

    public JTabbedPane createTabbedPane() {
        TableSelectionDemo newContentPane = new TableSelectionDemo();
        newContentPane.addComponentsToPane();

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(12, 87, 986, 466);
        add(tabbedPane);

        JPanel panel = new JPanel();
        getRootPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(12, 10, 70, 67);
        lblNewLabel.setIcon(new ImageIcon("./img/닭.png"));
        add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("  프로그램 이름");
        lblNewLabel_1.setBounds(94, 10, 292, 67);
        lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 22));
        add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("안녕하세요, ㅇㅇㅇ님");
        lblNewLabel_1_1.setBounds(746, 23, 252, 67);
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
        add(lblNewLabel_1_1);

        JPanel homePanel = new JPanel();
        tabbedPane.addTab("     홈     ", null, null, null);
        homePanel.setLayout(null);

        JPanel assetPanel = new JPanel();
        tabbedPane.addTab("     자산     ", null, newContentPane, null);
        assetPanel.setLayout(null);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        tabbedPane.addTab("     수령액     ", null, panel_1_1, null);

        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("     상품 추천     ", null, new Recommend(), null);
        panel_3.setLayout(null);

        return tabbedPane;
>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b
    }
}