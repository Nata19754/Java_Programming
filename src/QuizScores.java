import java.util.Scanner;

/*Write an application that allows a user to enter any number of student quiz scores until the user enters a
sentinel 99. If the score entered is less than 0 or greater than 10, display an appropriate message and do
not use the score. After all the scores have been entered, display the number of scores entered, the
highest score, the lowest score, and the arithmetic average */

public class QuizScores {
    public static void main(String[] args) {
        //create scanner for user input
        Scanner input = new Scanner(System.in);

        // Variables declared
        int score = 0;       // current score entered
        int count = 0;       // number of valid scores
        int total = 0;       // total of valid scores
        int highest = -1;    // track highest score
        int lowest = 11;     // track lowest score
        final int STOP = 99; // sentinel value

        //explains program to the users via prompt <3
        System.out.println("You MUST enter quiz scores between 0 and 10.");
        System.out.println("Enter 99 to stop at anytime.\n");

        // loop begins here to collect scores
        while (true) {
            System.out.print("Please enter a score between 0 and 10 :) : ");
            score = input.nextInt();
        // checks if user wishes to stop
            if (score == STOP) {
                break; // stop when user enters 99
            }

            if (score < 0 || score > 10) {
                System.out.println(" This score is not in the valid range. Please enter a number between 0 and 10.\n");
                continue; // skip invalid input
            }

            count++;
            total += score;

            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
            // displays results :)
        System.out.println("\nThese are your Results ");
        if (count > 0) {
            double average = (double) total / count;
            System.out.println("Number of valid scores: " + count);
            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.printf("Average score: %.2f\n", average);
        } else {
            System.out.println("No valid scores were entered.");
        }
        // end of program
        input.close();
    }
}
