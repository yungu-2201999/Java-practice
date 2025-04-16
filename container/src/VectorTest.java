import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<String> v = new Vector<>();

        v.add("a");
        v.add("b");
        v.add("c");

        for(String s : v) {
            System.out.println(s);
        }
    }
}
