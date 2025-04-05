import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        // 随机生成[0,1)之际double类型的数字
        System.out.println(random.nextDouble());
        // 随机生成int类型允许范围之内的整形数据
        System.out.println(random.nextInt());
        // 随机生成[0,1)之间的float类型的数据
        System.out.println(random.nextFloat());
        // 随机生成false或true
        System.out.println(random.nextBoolean());
        // 随机生成[0,10)之间的int类型的数据
        System.out.println(random.nextInt(10));
        // 随机生成[20,30)之间的int类型的数据
        System.out.println(20 + random.nextInt(10));
        // 随机生成[20,30)之间的int类型的数据
        System.out.println(20 + (int)(random.nextDouble() * 10));
    }
}
