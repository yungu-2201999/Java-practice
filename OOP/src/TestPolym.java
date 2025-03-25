public class TestPolym {
    public static void main(String[] args) {
        animalCry(new Dog());
        animalCry(new Cat());
    }
    static void animalCry(Animal a){
        System.out.println("TestPolym.animalCry");
        a.shout();
    }
}
