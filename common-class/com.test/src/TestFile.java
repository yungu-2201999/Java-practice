import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));// 获取当前目录
        File f= new File("a.txt");
        f.createNewFile();// 创建文件
        File f2 = new File("/Users/runzhi/Desktop/Java-practice/common-class/com.test/src/b.txt");
        f2.createNewFile();
    }
}
