import java.util.ArrayList;

public class MultidimensionalArraylist {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(6);
        a2.add(7);
        a2.add(8);
        a2.add(9);
        a2.add(10);
        a.add(a1);
        a.add(a2);
        for (int i = 0; i < a.size(); i++) {
            ArrayList<Integer> curr = a.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(a);

    }
}
