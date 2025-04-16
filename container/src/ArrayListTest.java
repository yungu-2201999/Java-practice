import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 实例化ArrayList容器
        List<String> list = new ArrayList<>();
        // 添加元素
        boolean flag1 = list.add("dodo");
        boolean flag2 = list.add("dodo1");
        System.out.println(flag1);
        // 在指定位置添加元素
        list.add(1, "old");// 这里索引位置不能大于元素个数
        list.add( "old123");
        System.out.println(list);

        System.out.println("//////-----------------");
        //  通过制定位置获取元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        // 通过循环获取集合中的元素
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("//////-----------------");
        String val = list.set(0, "itbz");
        System.out.println(val);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("//////-----------------");
//        String value = list.remove(0);
//        Boolean flag3 = list.remove("dodo1");
//        System.out.println(value);
//        System.out.println(flag3);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("//////-----------------");
//        list.clear();
        System.out.println(list.size());
        System.out.println("//////-----------------");
        System.out.println(list.isEmpty());
        System.out.println("//////-----------------");
        list.add("hahah");
        list.add("old");
        System.out.println(list.contains("hahah"));
        System.out.println("//////-----------------");
        System.out.println(list.indexOf("dodo1"));
        System.out.println(list.lastIndexOf("old"));
        System.out.println("//////-----------------");
        System.out.println(list);
        // 将ArrayList转为Object[]
        Object[] arr  = list.toArray();
        for(int i=0; i<arr.length; i++){
            String str = (String) arr[i];
            System.out.println(str);
        }
        System.out.println("//////-----------------");
        String[] arr2 = list.toArray(new String[list.size()]);
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        System.out.println("//////-----------------");
        List<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        List<String> b = new ArrayList<>();
        b.add("b");
        b.add("c");
        b.add("d");

        boolean flag6 = a.addAll(b);// a并b
        System.out.println(flag6);
        System.out.println(a);
        System.out.println("//////-----------------");
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");

        List<String> b1 = new ArrayList<>();
        b1.add("b");
        b1.add("c");
        b1.add("d");

        boolean flag7 = a1.retainAll(b1);// a交b
        System.out.println(flag7);
        System.out.println(a1);
        System.out.println("//////-----------------");
        List<String> a2 = new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");

        List<String> b2 = new ArrayList<>();
        b2.add("b");
        b2.add("c");
        b2.add("d");

        boolean flag8 = a2.removeAll(b2);// a差集b
        System.out.println(flag7);
        System.out.println(a2);
    }
}
