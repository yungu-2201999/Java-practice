import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.peek());
//        stack.pop();
        System.out.println(stack);

        System.out.println(stack.search("a"));
    }
}
