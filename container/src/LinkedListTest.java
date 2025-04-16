import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("b");
        linkedList.addFirst("c");
        linkedList.addLast("a");
        System.out.println(linkedList);
        System.out.println("===================");
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);

    }
}
