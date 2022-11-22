package login;

import account.MyMain;
//import swing.MainFrame;
import table.GUIMain;
import table.Home;
import table.MyFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainProcess{
    LoginView loginView;
    MyFrame main;
   
    public static void main(String[] args) {
        // 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인 창 보이기
        main.loginView.setMain(main); // 로그인 창에게 메인 클래스 보내기
    }
   
    // 메인프레임 창
    public void showFrameTest() {
        loginView.dispose();//로그인창닫기
        this.main = new MyFrame("title");//테스트프레임 오픈
    }
}
