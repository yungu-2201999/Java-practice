import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

    }
}
