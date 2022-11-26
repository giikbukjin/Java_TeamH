package table;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Home extends JPanel{

    public Home() {
        HomeView();
    }

    void HomeView() {
        setLayout(new BorderLayout(0,0));

        JButton button = new JButton("");
        button.setIcon(new ImageIcon("./img/shinhan.PNG"));
        add(button, BorderLayout.CENTER);
    }
}