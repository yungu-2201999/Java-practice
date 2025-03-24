public class User {
    int id;
    String name;
    String pwd;

    public User(){}
    public User(int id){
        this.id = id;
    }
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public static  void main(String[] args){
        User u = new User();
        User u1 = new User(10001);
        User u2 = new User(10002,"dodo");
        User u3 = new User(10003,"dodo1","123456");
    }
}
