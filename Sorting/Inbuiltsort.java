import java.util.Arrays;
import java.util.Collections;

public class Inbuiltsort {
    public static void inbuilt(Integer a[]) {
        Arrays.sort(a, 1, 3, Collections.reverseOrder());
    }

    public static void main(String args[]) {
        Integer a[] = { 5, 4, 3, 2, 1 };
        System.out.println("the elements before sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        inbuilt(a);
        System.out.println("the elements after sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
