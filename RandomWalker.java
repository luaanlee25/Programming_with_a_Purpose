public class RandomWalker {
    public static void main(String[] args) {
        // get the distance
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        while (Math.abs(x) + Math.abs(y) != r) {
            double random = Math.random();
            if (random <= 0.25) x = x + 1;
            else if (random <= 0.50) x = x - 1;
            else if (random <= 0.75) y = y + 1;
            else y = y - 1;

            System.out.println("(" + x + ", " + y + ")");
            steps = steps + 1;

        }
        System.out.println("steps = " + steps);


    }


}


