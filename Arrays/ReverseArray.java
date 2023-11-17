public class ReverseArray {
    public static void reverse(int a[]) {
        int b = 0, e = a.length - 1;
        while (b < e) {
            int temp = a[b];
            a[b] = a[e];
            a[e] = temp;
            b++;
            e--;
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("the arrays before reverse is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        reverse(a);
        System.out.println("the arrays after reverse is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
