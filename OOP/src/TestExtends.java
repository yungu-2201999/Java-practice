public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("dodo",174,"backend-end");
    }
}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");
    }
}

class Student extends Person{
    String majot;
    public void study(){
        System.out.println("学习");
    }

    public Student(String name,int height,String majot){
        this.name=name;
        this.height=height;
        this.majot=majot;
    }
}