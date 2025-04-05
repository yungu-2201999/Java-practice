public class Test {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();

        generic.setFlag("avd");
        System.out.println(generic.getFlag());

    }
}
