import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long nowNum = System.currentTimeMillis();
        System.out.println(nowNum);
        Date date1 = new Date(nowNum);
        System.out.println(date1);
        System.out.println(date1.getTime());

    }
}
