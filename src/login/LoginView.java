package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class LoginView extends JFrame {

    private static final long serialVersionUID = 1L;
    private MainProcess main;
    JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
    public static boolean id1;
    public static boolean pw1;
    public static boolean id2;
    public static boolean pw2;

    public static void main(String[] args) {
        //new LoginView();
    }

    public LoginView() {
    	setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 12));
        // setting
        setTitle("로그인");
        setSize(280, 150);
        setResizable(false);
        setLocation(800, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);

        // add
        getContentPane().add(panel);

        // visible
        setVisible(true);
    }

    public void placeLoginPanel(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("아이디");
        userLabel.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 13));
        userLabel.setBounds(20, 10, 70, 25);
        panel.add(userLabel);

        JLabel passLabel = new JLabel("비밀번호");
        passLabel.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 13));
        passLabel.setBounds(20, 40, 70, 25);
        panel.add(passLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 152, 25);
        panel.add(userText);

        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 152, 25);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });

        btnInit = new JButton("초기화");
        btnInit.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 13));
        btnInit.setBackground(new Color(232, 240, 249));
        btnInit.setBounds(20, 75, 90, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });

        btnLogin = new JButton("로그인");
        btnLogin.setFont(new Font("엘리스 디지털배움체", Font.PLAIN, 13));
        btnLogin.setBackground(new Color(232, 240, 249));
        btnLogin.setBounds(160, 75, 92, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });
    }

    public void isLoginCheck() {
    	id1 = userText.getText().equals("user1");
    	pw1 = new String(passText.getPassword()).equals("1111");
    	id2 = userText.getText().equals("user2");
    	pw2 = new String(passText.getPassword()).equals("2222");
        if(id1 == true && pw1 == true
                || id2 == true && pw2 == true) {
            JOptionPane.showMessageDialog(null, "로그인 성공");
            bLoginCheck = true; //판단

            // 로그인 성공이라면 매니저 창 띄우기
            if(isLogin()) {
                main.showFrameTest(); // 메인 창 메소드를 이용해 창 띄우기
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "로그인 실패");
        }
    }

    // mainProcess와 연동
    public void setMain(MainProcess main) {
        this.main = main;
    }

    public boolean isLogin() {
        return bLoginCheck;
    }
}