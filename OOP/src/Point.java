public class Point {
    double x,y;
    Point(double _x,double _y){
        x = _x;
        y = _y;
    }
    public double getDistance(Point p) {
        double d= Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
        return d;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3.0,4.0);
        Point origin = new Point(0,0);
        System.out.println(p1.getDistance(origin));

    }
}
