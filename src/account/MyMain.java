package account;

import table.GUIMain;

public class MyMain {
	void mymain() {
		AccountMgr engine = new AccountMgr();//데이터의 입력과 관리 담당 (=>BankMgr)
		engine.readAll("account.txt");
		GUIMain.startGUI(engine);//GUI시작 부분
	}
	public static void main(String[] args) {
		MyMain a = new MyMain();
		a.mymain();
	}
}