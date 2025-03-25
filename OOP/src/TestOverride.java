public class TestOverride {
    public static void main(String[] args) {
        Horse h =new Horse();
        h.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("跑");
    }
    public Vehicle getVehicle(){
        System.out.println("给你一个交通工具");
        return null;
    }
}

class Horse extends Vehicle{
    @Override
    public void run() {
        System.out.println("登登登");
    }
}
class Plane extends Vehicle{
    @Override
    public void run() {
        System.out.println("起飞");
    }
}