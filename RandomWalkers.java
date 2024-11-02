public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x = 0;
        int y = 0;
        int steps = 0;
        int totalSteps = 0;
        for (int i = 0; i < trials; i++) {
            while (Math.abs(x) + Math.abs(y) != r) {
                double random = Math.random();
                if (random <= 0.25) x = x + 1;
                else if (random <= 0.50) x = x - 1;
                else if (random <= 0.75) y = y + 1;
                else y = y - 1;
                steps = steps + 1;
            }
            totalSteps = totalSteps + steps;
            x = 0;
            y = 0;
            steps = 0;
        }
        double averageSteps = (double) totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}



