import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 获取元素
        set.add("a");
        set.add("b");
        set.add("c");


        // 获取元素，在Set容器中没有索引，因此没有对应的get(int index)方法
        for(String str: set){
            System.out.println(str);
        }

        // 删除元素
       boolean flag = set.remove("b");
       System.out.println(flag);

       // 拿到元素个数
       System.out.println(set.size());


    }
}
