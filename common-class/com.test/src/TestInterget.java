public class TestInterget {
    public static void main(String[] args) {
//        Integer i = new Integer(1);// java9后被废弃
        Integer j = Integer.valueOf(10);// 推荐

        int a = j.intValue();
        double b = j.doubleValue();

        Integer m = Integer.valueOf(10);
        System.out.println(Integer.MAX_VALUE);

        // 自动装箱
        Integer x = 100; // 编译器： Integer x = Integer.valueOf(100)
        // 自动拆箱
        int y = x; // 编译器： int y = x.intValue();

        // 测试缓存问题
        Integer x1 = 100;
        Integer x2 = 100;
        Integer x3 = 1000;
        Integer x4 = 1000;
        System.out.println(x1 == x2);// true
        System.out.println(x3 == x4);// false
        System.out.println(x1.equals(x2));// true
        System.out.println(x3.equals(x4)); // true
    }
}
