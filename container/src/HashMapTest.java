import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 实例化HashMap容器
        Map<String, String> map= new HashMap<>();
        map.put("a","A");
        String value =  map.put("a","B");
        System.out.println(value);
        System.out.println("-------------------------------");
        String val = map.get("a");
        System.out.println(val);
        System.out.println("-------------------------------");

        map.put("b","B");
        map.put("c","C");
        map.put("d","D");
        map.put("e","E");
        // 获取HashMap所有元素，可以使用keySet方法与get方法一并完成

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String v1 =map.get(key);
            System.out.println(key+ "  --------  " + v1);
        }
        System.out.println("-------------------------------");

        // 通过entrySet 拿到值
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String v = entry.getValue();
            System.out.println(key + "  --------  " + v);
        }
        // 取并集
        System.out.println("-------------------------------");
        Map<String,String> map2 = new HashMap<>();
        map2.put("f","F");

        map2.putAll(map);
        Set<String> keys2 = map2.keySet();
        for (String key : keys2) {
            System.out.println(key + "  --------  " + map2.get(key));
        }








    }
}
