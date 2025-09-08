//This is part 2 of assignment 2 of Java Programming Fall 2025

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    private static final int QUARTS_PER_GALLON = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer quartsNeeded = null;
        while (quartsNeeded == null) {
            System.out.print("Please input quarts needed: ");

            if (input.hasNextInt()) {
                int candidate = input.nextInt();
                if (candidate >= 0) {
                    quartsNeeded = candidate;
                } else {
                    System.out.println("Please enter a non-negative whole number.");
                }
            } else {
                input.next();
                System.out.println("Please enter a non-negative whole number.");
            }
        }

        int gallons = quartsNeeded / QUARTS_PER_GALLON; // whole gallons
        int quarts = quartsNeeded % QUARTS_PER_GALLON; // leftover quarts

        System.out.println("A job that needs " + quartsNeeded
                + " quarts requires " + gallons + " gallons plus "
                + quarts + " quarts");

        input.close();
    }
}
