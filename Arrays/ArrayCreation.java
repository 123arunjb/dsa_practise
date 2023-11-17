import java.util.Scanner;

public class ArrayCreation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("the array elements are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int b[] = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("the 2nd array elements are");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        b[9] = 0;
        System.out.println("the array elements after modification are ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}