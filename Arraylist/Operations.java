import java.util.ArrayList;

public class Operations {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        System.out.println(a.get(2));
        a.remove(2);
        System.out.println(a);
        a.set(2, 12);
        System.out.println(a);
        System.out.println(a.contains(4));
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

}
