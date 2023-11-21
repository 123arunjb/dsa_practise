import java.util.ArrayList;
import java.util.Scanner;

public class MostwaterContainer1 {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // assuming 9 elements
        for (int i = 0; i < 9; i++) {
            a.add(sc.nextInt());1
        }
        System.out.println(a);
        int highest = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                highest = Math.max(highest, Math.min(a.get(i), a.get(j)) * (j - i));
            }
        }
        System.out.println("the maximum water content is " + highest);
    }
}
