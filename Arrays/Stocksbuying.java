public class Stocksbuying {

    public static void maxprofit(int a[]) {
        int bp = a[0];
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < bp)
                bp = a[i];
            else
                max = Math.max(max, a[i] - bp);
        }
        System.out.println("the maximum profit for the above stocks is" + max);
    }

    public static void main(String args[]) {
        int a[] = { 7, 1, 5, 3, 6, 4 };
        maxprofit(a);
    }
}
