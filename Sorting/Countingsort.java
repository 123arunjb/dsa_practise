
public class Countingsort {
    public static void count(int a[]) {
        // Finding maximum
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        // count array
        int count[] = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
        int j = 0;
        int b[] = new int[a.length];
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                b[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("the elements after sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static void main(String args[]) {
        int a[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        System.out.println("the elements before sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        count(a);
        System.out.println();
        // System.out.println("the elements after sorting are ");
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
    }
}
