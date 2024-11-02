public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int line = 0; line < n; line++) {
            for (int j = 0; j < n; j++) {
                if (j > line) {
                    int n1 = (n - line + j) % n;
                    if (n1 > width) {
                        System.out.print("0  ");
                    }
                    else
                        System.out.print("*  ");
                }
                else {
                    int n1 = (line - j + n) % n;
                    // System.out.print("trace n1:" + n1);
                    if (n1 > width) {
                        System.out.print("0  ");
                    }
                    else
                        System.out.print("*  ");
                }

            }
            System.out.println();
        }
    }
}

