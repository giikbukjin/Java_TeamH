package table;

import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import account.Account;
import account.AccountMgr;
import mgr.Manageable;
import recommend.RcmdItemMgr;
import recommend.RcmdItemScroll;
import table.TableSelectionDemo;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Recommend extends JPanel{

    /**
     *
     * Create the panel.
     * @return
     *
     */

    public Recommend() {
        RecommendView();
    }

    void RecommendView() {
        TableSelectionDemo tableDemo = new TableSelectionDemo();
        setLayout(null);
        JLabel userLabel = new JLabel("보유현금");
        userLabel.setBounds(80, 190, 80, 25);
        add(userLabel);

        JLabel passLabel = new JLabel("저축가능액");
        passLabel.setBounds(70, 240, 80, 25);
        add(passLabel);
        
        JTextField kwdTextField1 = new JTextField();
        JTextField kwdTextField2 = new JTextField();
        kwdTextField1.setText(null);
        kwdTextField2.setText(null);
        kwdTextField1.setBounds(160, 180, 240, 40);
        kwdTextField2.setBounds(160, 230, 240, 40);
        add(kwdTextField1);
        add(kwdTextField2);
        
        JButton recommend = new JButton("상품 추천");
        recommend.setBounds(430, 190, 90, 70);
        add(recommend);

        recommend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (0 < Integer.parseInt(kwdTextField1.getText())
                        && Integer.parseInt(kwdTextField1.getText()) < 1000000) {
                    if (e.getActionCommand().equals("상품 추천")) {
                        tableDemo.showRecommend();
                    }
                }
            }
        });
    }
}