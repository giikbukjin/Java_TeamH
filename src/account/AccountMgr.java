package account;

import java.util.List;
import java.util.Scanner;

import facade.DataEngineInterface;
import mgr.Factory;
import mgr.Manageable;
import mgr.Manager;

public class AccountMgr implements DataEngineInterface {

	// 데이터 입력하여 리스트로 관리, 추가/삭제/수정/검색의 기능을 제공하는 클래스
	// 테이블의 헤더 데이터 제공 부분
	private static final String[] labels = { "유형", "은행", "계좌번호", "월 납입액(원)", "이율", "자산(원)", "만기일", "현재 개월 수",
			"예적금 개월 수" };

	@Override
	public int getColumnCount() {
		return labels.length;
	}

	// 테이블의 열 제목을 스트링 배열로 돌려줌
	public String[] getColumnNames() {
		return labels;
	}

	// GUI에서 호출할 메소드들, DataEngineInterface의 구현 메소드들
	Scanner scan = new Scanner(System.in);
	private Manager mgr = new Manager();

	@Override
	public void readAll(String filename) {
		mgr.readAll("./txt/account.txt", new Factory() {
			public Manageable create() {
				return new Account();
			}
		});
	}

	@Override // findAll기능 사용
	public List<Manageable> search(String kwd) {
		if (kwd == null)
			return mgr.mList;
		return mgr.findAll(kwd);
	}

	@Override
	public void addNewItem(String[] editTexts) {
		Account s = new Account();
		s.set(editTexts);
		mgr.mList.add(s);
	}

	@Override
	public void update(String[] editTexts) {
		Account s = (Account) mgr.find(editTexts[0]);
		s.set(editTexts);
	}

	@Override
	public void remove(String kwd) {
		Account s = (Account) mgr.find(kwd);
		mgr.mList.remove(s);
	}
}