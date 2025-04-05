public class MyInteger {
    private final  int value;
    private static MyInteger[] cache;
    private static final int HIGH = 127;
    private static final int LOW = -128;

    static{
        cache = new MyInteger[HIGH - LOW + 1];
        for(int i = LOW; i<=HIGH; i++){
            cache[i+128] = new MyInteger(i);
        }
//        System.out.println(Arrays.toString(cache));
    }

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value+ "";
    }
    public static MyInteger valueOf(int value){
        if(value > HIGH&& value < LOW){
            return cache[value - LOW];
        }
       return new MyInteger(value);
    }

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(1);
    }
}
