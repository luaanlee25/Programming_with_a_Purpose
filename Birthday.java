public class Birthday {

    public static void main(String[] args) {

        // Take n and trials from command line
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        // Create array which has the size n+1 (365+1 days)
        long[] duplicateBirthday = new long[n + 1];


        for (int i = 0; i < trials; i++) {
            int currentStudentId = 0; // Initial number of Student ID = 0
            boolean[] birthday = new boolean[n];

            while (currentStudentId < n) {
                // Choose a birthday for the next person,
                // uniformly at random between 0 and n−1.
                int studentBirthday = (int) (Math.random() * n);
                // Have that person enter the room.
                currentStudentId++;
                // Check if there is another person with the same birthday.
                if (birthday[studentBirthday]) {
                    duplicateBirthday[currentStudentId]++;
                    break;
                }

                birthday[studentBirthday] = true;
            }
        }

        double percent;
        long cumulativeSum = 0;
        for (int studentID = 1; studentID <= n; studentID++) {
            cumulativeSum += duplicateBirthday[studentID];
            percent = (double) cumulativeSum / (double) trials;
            System.out.println(studentID +
                                       "\t" + duplicateBirthday[studentID] +
                                       "\t" + percent);
            if (percent >= 0.5)
                break;
            if (studentID > n)
                break;

        }
    }
}
