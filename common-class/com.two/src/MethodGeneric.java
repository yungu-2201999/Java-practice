public class MethodGeneric {

    public <T> void setName(T name){
        System.out.println(name);
    }
    public <T> T getName(T name){
        return name;
    }
}

