import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(9);
        a.add(2);
        a.add(1);
        a.add(8);
        a.add(7);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
    }
}
