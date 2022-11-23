package table;

import javax.swing.JLabel;
import javax.swing.JPanel;

import account.Account;
import recommend.RcmdItemScroll;
import table.GUIMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JDialog;

public class RecommendDialog extends javax.swing.JDialog {

    void setup() {
        setTitle("상품상세보기");
        JPanel pane = new JPanel(new BorderLayout());
        JPanel lpane = new JPanel(new BorderLayout());

        TableSelectionDemo newContentPane = new TableSelectionDemo();
        newContentPane.addComponentsToPane();
        RcmdItemScroll rimContentPane = new RcmdItemScroll();

        lpane.add(rimContentPane.scroll);


        pane.add(lpane, BorderLayout.CENTER);

        this.setMinimumSize(new Dimension(800, 500));  // 대화상자 크기 설정
        setContentPane(pane);
    }
}
