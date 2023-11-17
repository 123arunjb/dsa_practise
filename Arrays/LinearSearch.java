import java.util.Scanner;

public class LinearSearch {
    public static void ls(int a[], int ele) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                System.out.println("the search element is found at " + i + " index");
                return;
            }
        }
        System.out.println("the search element is not found ");
    }

    public static void main(String args[]) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the search element ");
        int ele = sc.nextInt();
        ls(a, ele);

    }
}
