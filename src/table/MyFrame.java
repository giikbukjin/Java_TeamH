package table;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import calculate.Calculate;
import home.Home;
import login.LoginView;
import recommend.Recommend;
import java.awt.Color;

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public MyFrame(String title) {
    	getContentPane().setBackground(new Color(180, 200, 226));
        createFrame(title);
        JTabbedPane pane = createTabbedPane();
        getContentPane().add(pane, BorderLayout.CENTER);
        pane.setBackground(new Color(255, 255, 255));
    }

    void createFrame(String title) {
        Dimension dim = new Dimension(1024, 600);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        this.setVisible(true);
        this.setPreferredSize(dim);
		this.setBackground(new Color(255, 255, 255));
    }

    public JTabbedPane createTabbedPane() {
        TableSelectionDemo newContentPane = new TableSelectionDemo();
        newContentPane.addComponentsToPane();
        newContentPane.setBackground(new Color(241, 241, 241));

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBackground(new Color(255, 255, 255));
        tabbedPane.setBounds(12, 87, 986, 466);
        getContentPane().add(tabbedPane);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        getRootPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(new ImageIcon("./img/LOGO.png"));
        lblNewLabel.setBounds(30, 10, 70, 70);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("  뱅크 하이웨이    BANK HIGHWAY");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(100, 10, 350, 67);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 22));
        getContentPane().add(lblNewLabel_1);

        LoginView logV = new LoginView();
        if(logV.id1 == true) {
        	JLabel lblNewLabel_1_1 = new JLabel("안녕하세요, user1님.");
        	lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
        	lblNewLabel_1_1.setBounds(746, 23, 252, 67);
        	lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        	lblNewLabel_1_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 18));
        	getContentPane().add(lblNewLabel_1_1);
        }
        
        if(logV.id2 == true) {
        	JLabel lblNewLabel_1_1 = new JLabel("안녕하세요, user2님.");
        	lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
        	lblNewLabel_1_1.setBounds(746, 23, 252, 67);
        	lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        	lblNewLabel_1_1.setFont(new Font("엘리스 디지털배움체", Font.BOLD, 18));
        	getContentPane().add(lblNewLabel_1_1);
        }

        JPanel homePanel = new JPanel();
        Home home = new Home();
        home.setBackground(new Color(255, 255, 255));
        homePanel.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("        홈        ", null, home, null);
        tabbedPane.setBackgroundAt(0, new Color(243, 246, 250));
        homePanel.setLayout(null);

        JPanel assetPanel = new JPanel();
        assetPanel.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("       자산       ", null, newContentPane, null);
        tabbedPane.setBackgroundAt(1, new Color(243, 246, 250));
        assetPanel.setLayout(null);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBackground(new Color(255, 255, 255));
        panel_1_1.setLayout(null);
        Calculate calculate = new Calculate();
        calculate.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("      수령액      ", null, calculate, null);
        tabbedPane.setBackgroundAt(2, new Color(243, 246, 250));

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        Recommend recommend = new Recommend();
        recommend.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("     상품 추천     ", null, recommend, null);
        tabbedPane.setBackgroundAt(3, new Color(243, 246, 250));
        panel_3.setLayout(null);

        return tabbedPane;
    }
}