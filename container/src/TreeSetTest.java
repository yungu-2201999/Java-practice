import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // 实例化TreeSet
        Set<String> set = new TreeSet<>();
        // 添加元素
        set.add("a");
        set.add("b");
        set.add("d");
        set.add("c");
        set.add("a");
        // 获取元素
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("------------------");
        Student s = new Student("dodo",18);


    }

}
