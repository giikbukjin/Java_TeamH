package login;

import swing.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainProcess{
    LoginView loginView;
   
    public static void main(String[] args) {
        // 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인 창 보이기
        main.loginView.setMain(main); // 로그인 창에게 메인 클래스 보내기
    }
   
    // 메인프레임 창
    public void showFrameTest() {
        loginView.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //loginView.dispose(); // 로그인 창 닫기
                loginView.setVisible(false);
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}
