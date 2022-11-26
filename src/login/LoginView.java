package login;

//import swing.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
<<<<<<< HEAD
 
public class LoginView extends JFrame{

	private static final long serialVersionUID = 1L;
	private MainProcess main;
=======

public class LoginView extends JFrame {

    private static final long serialVersionUID = 1L;
    private MainProcess main;
>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b
    JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;

    public static void main(String[] args) {
        //new LoginView();
    }

    public LoginView() {
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
        add(panel);

        // visible
        setVisible(true);
    }

    public void placeLoginPanel(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("아이디");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        JLabel passLabel = new JLabel("비밀번호");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });

        btnInit = new JButton("초기화");
        btnInit.setBounds(10, 80, 100, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });

        btnLogin = new JButton("로그인");
        btnLogin.setBounds(160, 80, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });
    }
<<<<<<< HEAD
   
    public void isLoginCheck() {
        if(userText.getText().equals("test") && new String(passText.getPassword()).equals("1234")) {
            JOptionPane.showMessageDialog(null, "로그인 성공");
            bLoginCheck = true; //판단
           
=======

    public void isLoginCheck() {
        if(userText.getText().equals("user1") && new String(passText.getPassword()).equals("1111")
                || userText.getText().equals("user2") && new String(passText.getPassword()).equals("2222")) {
            JOptionPane.showMessageDialog(null, "로그인 성공");
            bLoginCheck = true; //판단

>>>>>>> 2649020ebc6218d4e7ad46b22c617da7b1a7d47b
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