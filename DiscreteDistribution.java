public class DiscreteDistribution {
    public static void main(String[] args) {
        // Take input m from argument
        int b = Integer.parseInt(args[0]);
        // create string a with n component
        int n = args.length;
        int[] a = new int[n];
        // array is a0....an-1

        // create index i for a(i) [0;n)
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        // create string s with n component
        int[] s = new int[n];

        // Define the cumulative sums Si=a1+a2+…+ ai, with S0=0
        for (int i = 1; i < n; i++) {
            s[0] = 0;
            s[i] = s[i - 1] + a[i];
        }
        // s1 = s0 + a1
        // i = 0 < r < n-1
        // s6 = s5+a6


        for (int m = 0; m < b; m++) {
            int index = 1;
            // Pick random r [0, Sn-1)
            int r = (int) (s[n - 1] * Math.random());
            // Find the unique index i between 1 and n such that Si−1 ≤ r < Si
            for (int i = 1; i <= n; i++) {
                if (s[i - 1] <= r && r < s[i]) {
                    index = i;
                }
            }
            System.out.print(index + " ");
        }
        System.out.println();
    }
}




