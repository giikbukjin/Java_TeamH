package recommend;

import java.util.Scanner;

import mgr.Manageable;

public class RcmdItem implements Manageable{

    String saving; // 종류
    String bank; // 은행이름
    String ItemName; // 상품명
    String rate; // 이율
    int month; // 최대개월수
    long limit; // 납입한도
    String fc; // 금융권

    @Override
    public void read(Scanner scan) {
        // TODO Auto-generated method stub
        saving = scan.next();
        bank = scan.next();
        ItemName = scan.next();
        rate = scan.next();
        month = scan.nextInt();
        limit = scan.nextLong();
        fc = scan.next();
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.printf("[%s] %s %s %s %d %d %s \n"
                , saving, bank, ItemName, rate, month, limit, fc);

    }
    @Override
    public boolean matches(String kwd) {
        // TODO Auto-generated method stub
        return false;
    }


}
