public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]); // k = mines

        // game grid is [m+2][n+2] to avoid out of bounds and reduce edge cases
        char[][] grid = new char[m + 2][n + 2];
        for (int i = 0; i < m + 2; i++)
            for (int j = 0; j < n + 2; j++)
                grid[i][j] = '0';

        // place mines
        for (int mines = 0; mines < k; mines++) {
            int i, j;
            do {
                i = (int) (1 + Math.random() * m);
                j = (int) (1 + Math.random() * n);
            } while (grid[i][j] == '*');
            grid[i][j] = '*';
        }

        // calculate adjacent mines
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (grid[i][j] != '*')
                    for (int ii = -1; ii <= 1; ii++)
                        for (int jj = -1; jj <= 1; jj++)
                            if (grid[i + ii][j + jj] == '*')
                                grid[i][j]++;

        // print grid
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }
}
