package account;

import table.GUIMain;

public class MyMain {
	void mymain() {
		AccountMgr engine = new AccountMgr(); //데이터의 입력과 관리 담당 (=> BankMgr)
		engine.readAll("./txt/account.txt");
		GUIMain.startGUI(engine); //GUI 시작 부분
	}
	public void main(String[] args) {
		MyMain a = new MyMain();
		a.mymain();
	}
}