
public class TrappingRainwater {
    public static void totalwater(int a[]) {
        int rm[] = new int[a.length];
        int lm[] = new int[a.length];
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            left = Math.max(left, a[i]);
            lm[i] = left;

        }
        int right = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            right = Math.max(right, a[i]);
            rm[i] = right;
        }
        System.out.println("the left max array is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(lm[i] + " ");
        }
        System.out.println("the right max array is ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(rm[i] + " ");
        }
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total = total + (Math.min(rm[i], lm[i]) - a[i]);
        }
        System.out.println("the total volume of trapped rainwater is " + total);
    }

    public static void main(String args[]) {
        int a[] = { 4, 2, 0, 6, 3, 2, 5 };
        totalwater(a);
    }

}
