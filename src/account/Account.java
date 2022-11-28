package account;

import java.text.NumberFormat;
import java.util.Scanner;

import facade.UIData;
import mgr.Manageable;

public class Account implements Manageable, UIData {
////
	// 적금 신한은행 110-510-493476 100000 4.00 300000 2024/07/25 현재3개월 24
	public String user;//회원
	public static String saving; // 종류
	public String bank; // 은행이름
	public String good;//상품
	public String num; // 계좌번호
	public int month; // 월납입액
	public float rate; // 이율
	public int asset; // 자산
	public String start;//가입일
	public String expire; // 만료일
	public String present; // 현재 개월 수
	public int nMonth; // 예금/적금 든 개월 수


	public void set(Object[] row) {
		saving = (String) row[0];
		bank = (String) row[1];
		num = (String) row[2];
		month = Integer.parseInt((String) row[3]);
		rate = Float.parseFloat((String) row[4]);
		asset = Integer.parseInt((String) row[5]);
		expire = (String) row[6];
		present = (String) row[7];
		nMonth = Integer.parseInt((String) row[8]);

	}

	public void read(Scanner scan) {
		user = scan.next();
		saving = scan.next();
		bank = scan.next();
		good = scan.next();
		num = scan.next();
		month = scan.nextInt();
		rate = scan.nextFloat();
		asset = scan.nextInt();
		start = scan.next();
		expire = scan.next();
		present = scan.next();
		nMonth = scan.nextInt();
	}

	public String[] getUiTexts() {
		NumberFormat numberFormat = NumberFormat.getInstance();
		String realAsset = numberFormat.format(asset);
		String realMonth = numberFormat.format(month);
		return new String[] { saving, bank, num, realMonth, "" + rate, realAsset, expire, present, "" + nMonth };
	}


	public void print() {
		System.out.printf("[%s] %s %s %d %.2f %d %s %d %d\n", saving, bank, num, month, rate, asset, expire, present,
				nMonth);
	}

	public boolean matches(String kwd) {
		if (saving.contentEquals(kwd))
			return true;
		if ((month + "").contentEquals(kwd))
			return true;
		if ((asset + "").contentEquals(kwd))
			return true;
		if (kwd.contentEquals("" + rate))
			return true;
		if (bank.contains(kwd))
			return true;
		if (num.contains(kwd))
			return true;
		if (expire.contains(kwd))
			return true;
		if (present.contains(kwd))
			return true;
		if ((nMonth + "").contains(kwd))
			return true;
		return false;
	}
}