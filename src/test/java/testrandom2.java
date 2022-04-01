import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testrandom2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dễ");
        list.add("Trung");
        list.add("Khó");
        Collections.shuffle(list);
        System.out.print(list.get(1));
    }
}
