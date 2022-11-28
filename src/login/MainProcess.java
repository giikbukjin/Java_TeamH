package login;

import account.MyMain;
import table.MyFrame;

public class MainProcess {
    LoginView loginView;
    MyFrame mainFrm;

    public static void main(String[] args) {
        // 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인 창 보이기
        main.loginView.setMain(main); // 로그인 창에게 메인 클래스 보내기
    }

    // 메인프레임 창
    public void showFrameTest() {
        MyMain.main(null);
        loginView.setVisible(false);
    }
}