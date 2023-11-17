public class Maxsubarray3 {
    public static void maxsum(int a[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            cs = cs + a[i];
            if (cs < 0)
                cs = 0;
            if (cs > ms)
                ms = cs;

        }
        System.out.println("the maximum sum of the subarray is " + ms);
    }

    public static void main(String args[]) {
        int a[] = { 1, -2, 6, -1, 3 };
        maxsum(a);
    }
}
