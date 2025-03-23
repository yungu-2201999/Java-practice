public class TestConstant {
    public static void main(String[] args) {
        final double PI = 3.14159265358979323846;

        final int MAX_SPEED = 120;

        int r = 4;
        double area = PI*r*r;

        double circle = 2*PI*r;
        System.out.println("面积是"+area);
        System.out.println("周长是"+circle);
    }
}
