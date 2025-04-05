public class Test2 {
    public static void main(String[] args) {
        IgenericImpl igeneric = new IgenericImpl();
        System.out.println(igeneric.getName("dodo"));

        Igeneric<String> igeneric1 = new IgenericImpl();
        System.out.println(igeneric1.getName("dodo1"));
    }
}
