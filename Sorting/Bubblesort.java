public class Bubblesort {
    public static void bubble(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 5, 4, 3, 2, 1 };
        System.out.println("the elements before sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        bubble(a);
        System.out.println("the elements after sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
