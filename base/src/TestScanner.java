import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名");
        String uname = s.nextLine();

        System.out.println("用户名"+ uname);

    }
}
