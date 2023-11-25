public class Insertionsort {
    public static void insertion(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int index = i;
            while (index > 0 && a[index - 1] > temp) {
                a[index] = a[index - 1];
                index--;

            }
            a[index] = temp;
        }
    }

    public static void main(String args[]) {
        int a[] = { 5, 4, 3, 2, 1 };
        System.out.println("the elements before sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        insertion(a);
        System.out.println("the elements after sorting are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
