public class Largest {
    public static void largest(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        System.out.println("the maximum element in the array is " + max);
    }

    public static void smallest(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("the smallest element in the array is " + min);
    }

    public static void main(String args[]) {
        int a[] = { 4, 5, 3, 2, 1 };
        largest(a);
        smallest(a);
    }

}
