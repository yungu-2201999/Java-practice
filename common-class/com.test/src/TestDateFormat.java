import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1 = "2020-12-31 23:59:59";
        Date date = format.parse(date1);
        System.out.println(date);// Thu Dec 31 23:59:59 CST 2020
        System.out.println(date.getTime());// 1609430399000

        DateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date2 = new Date(1718371984719L);
        String date2Str = format1.format(date2);
        System.out.println(date2Str);// 2024年06月14日 21时33分04秒
    }
}
