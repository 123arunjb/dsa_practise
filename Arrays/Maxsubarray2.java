public class Maxsubarray2 {
    public static void maxsum(int a[]) {
        int prefix[] = new int[a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            prefix[i] = sum;
        }
        System.out.println("the prefix array is ");
        for (int i = 0; i < prefix.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        int max = Integer.MIN_VALUE;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                if (i == 0) {
                    sum1 = prefix[j];
                } else
                    sum1 = prefix[j] - prefix[i - 1];
                if (sum1 > max)
                    max = sum1;
            }
        }
        System.out.println("the maximum sum of the subarray is " + max);
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        maxsum(a);
    }
}
