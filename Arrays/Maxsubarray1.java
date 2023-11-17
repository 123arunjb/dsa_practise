public class Maxsubarray1 {
    public static void maxsum(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println("the maximum sum of the subarray is " + max);
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        maxsum(a);
    }
}
