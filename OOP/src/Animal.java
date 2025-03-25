public class Animal {
    public void shout(){
        System.out.println("叫了一声");
    }
}

class Dog extends Animal{
    public void shout() {
        System.out.println("www");
    }
    public void seeDoor(){
        System.out.println("看门。。。");
    }
}

class Cat extends  Animal{
    public void shout(){
        System.out.println("mmmm");
    }
}