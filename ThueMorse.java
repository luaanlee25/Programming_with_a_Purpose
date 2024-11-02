public class ThueMorse {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ThueMorse <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        boolean[] sequence = new boolean[n * n];

        // Generate Thue-Morse sequence
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sequence[i * n + j] = Integer.bitCount(i ^ j) % 2 == 0;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char symbol = sequence[i * n + j] ? '+' : '-';
                System.out.print(symbol + "  "); // Two spaces between characters
            }
            System.out.println(); // Move to the next row
        }
    }
}



