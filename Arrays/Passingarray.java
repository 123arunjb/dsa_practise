
public class Passingarray {
    public static void change(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("the array elements before changing are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        change(a);
        System.out.println("the array elements after passing to a function parameter are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
