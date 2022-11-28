package mgr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	static public Scanner scan = new Scanner(System.in);
	static public ArrayList<Manageable> mList = new ArrayList<>();

	public void readAll(String filename, Factory fac) { // 파일 읽어오는 함수
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(0);
		}
		while (filein.hasNext()) {
			Manageable m = fac.create();
			m.read(filein);
			mList.add(m);
		}
		filein.close();
	}

	public void printAll() { // 전체 값 출력 함수
		System.out.format("\n=============== 계좌 현황 " + "===============\n");
		for (Manageable b : mList)
			b.print();
	}

	public void search() { // 원하는 정보 검색 함수
		String kwd = null;
		while (true) {
			System.out.format("\n - 검색 키워드 : ");
			kwd = scan.next();
			if (kwd.contentEquals("end"))
				break;
			System.out.format("\n============ \"%s\"가 포함된 결과 " + "============\n", kwd);
			for (Manageable m : mList) {
				if (m.matches(kwd))
					m.print();
			}
		}
	}

	public List<Manageable> findAll(String kwd) {
		List<Manageable> result = new ArrayList<>();
		for (Manageable m : mList) {
			if (m.matches(kwd))
				result.add(m);
		}
		return result;
	}

	public Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println(filename + ": 파일 없음");
			System.exit(0);
		}
		return filein;
	}

	public Manageable find(String kwd) {
		for (Manageable m : mList)
			if (m.matches(kwd))
				return m;
		return null;
	}
}