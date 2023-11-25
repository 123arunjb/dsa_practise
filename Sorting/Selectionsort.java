public class Selectionsort {
    public static void selection(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
        selection(a);
        System.out.println("the elements after sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
