package table;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import home.IpchulgumDialog;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Home extends JPanel{
    public Home() {
        HomeView();
    }

    void HomeView() {
    	IpchulgumDialog info = new IpchulgumDialog(); //입출금, 적금, 예금에 따라 변경
    	//or JeokgumDialog info = new JeokgumDialog();
    	//or YegumDialog info = new YegumDialog();
        setLayout(null);
        
        JLabel lblNewLabel_3 = new JLabel();
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setIcon(new ImageIcon("./img/shinhan.png"));
        lblNewLabel_3.setBackground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(35, 29, 95, 95);
        add(lblNewLabel_3);
       
        JButton btnNewButton = new JButton("신한은행     주거래우대통장     잔고 : 1,500,000");
        btnNewButton.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 18));
        btnNewButton.setBounds(142, 29, 807, 95);
        add(btnNewButton);
       
        btnNewButton.addActionListener(new ActionListener() {
        	@Override
    	    public void actionPerformed(ActionEvent e) {
        		info.showIpchulgum(); //입출금, 적금, 예금에 따라 변경
        		//or info.showJeokgum();
        		//or info.showYegum();
    	    }
    	});
       
       /*JLabel lblNewLabel_3_1 = new JLabel("New label");
       lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
       lblNewLabel_3_1.setBounds(35, 172, 95, 95);
       add(lblNewLabel_3_1);
       
       JButton btnNewButton_1 = new JButton("신한은행     주거래우대통장     잔고 : 1,500,000");
       btnNewButton_1.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 18));
       btnNewButton_1.setBounds(142, 172, 807, 95);
       add(btnNewButton_1);
       
       JLabel lblNewLabel_3_2 = new JLabel("New label");
       lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
       lblNewLabel_3_2.setBounds(35, 311, 95, 95);
       add(lblNewLabel_3_2);
       
       JButton btnNewButton_2 = new JButton("신한은행     주거래우대통장     잔고 : 1,500,000");
       btnNewButton_2.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 18));
       btnNewButton_2.setBounds(142, 311, 807, 95);
       add(btnNewButton_2);*/
    }
}