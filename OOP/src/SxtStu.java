public class SxtStu {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("学习中");
    }

    public void kickball(){
        System.out.println("踢球");
    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "dodo";
        System.out.println(s1.id);
        System.out.println(s1.sname);
    }

}
