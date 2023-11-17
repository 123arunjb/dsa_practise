import java.util.Scanner;

public class BinarySearch {
    public static void binary(int a[], int ele) {
        int b = 0, e = a.length - 1;

        while (b <= e) {
            int mid = (b + e) / 2;
            if (a[mid] == ele) {
                System.out.println("the search element is found at " + mid + " index");
                return;
            } else if (ele > a[mid]) {
                b = mid + 1;
            } else
                e = mid - 1;

        }
        System.out.println("the search element is not found");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 3, 4, 5, 6, 7 };
        System.out.println("enter the search element ");
        int ele = sc.nextInt();
        binary(a, ele);

    }
}
