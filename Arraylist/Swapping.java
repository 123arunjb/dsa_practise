import java.util.ArrayList;

public class Swapping {
    public static void main(String main[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println(a);
        int temp = a.get(1);
        a.set(1, a.get(5));
        a.set(5, temp);
        System.out.println(a);

    }
}
