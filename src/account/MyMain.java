package account;

import login.LoginView;
import table.GUIMain;

public class MyMain {
	void mymain() {
		LoginView logV = new LoginView();
		if(logV.id1 == true && logV.pw1 == true) {
			AccountMgr engine = new AccountMgr(); //데이터의 입력과 관리 담당 (=> BankMgr)
			engine.readAll("./txt/account1.txt");
			GUIMain.startGUI(engine); //GUI 시작 부분
		}
		
		if(logV.id2 == true && logV.pw2 == true) {
			AccountMgr engine = new AccountMgr(); //데이터의 입력과 관리 담당 (=> BankMgr)
			engine.readAll("./txt/account2.txt");
			GUIMain.startGUI(engine); //GUI 시작 부분
			}
	}
	public static void main(String[] args) {
		MyMain a = new MyMain();
		a.mymain();
	}
}