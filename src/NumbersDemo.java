// Numbers Demo
// Ask user for two integers
// Show each number times 2, plus 5, and squared

import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // gets two numbers with validation
        int first = getInt(input, "Enter an integer >> ");
        int second = getInt(input, "Enter another integer >> ");

        // does work for first number
        displayTwiceTheNumber(first);
        displayNumberPlusFive(first);
        displayNumberSquared(first);

        // does work for second number
        displayTwiceTheNumber(second);
        displayNumberPlusFive(second);
        displayNumberSquared(second);

        input.close();
    }

    // asks for int until user types one
    public static int getInt(Scanner input, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                System.out.println("Please enter an integer.");
                input.next(); // throw away bad input
            }
        }
    }

    // shows number times 2
    public static void displayTwiceTheNumber(int number) {
        int result = number * 2;
        System.out.println(number + " times 2 is " + result);
    }

    // shows number plus 5
    public static void displayNumberPlusFive(int number) {
        int result = number + 5;
        System.out.println(number + " plus 5 is " + result);
    }

    // shows number squared
    public static void displayNumberSquared(int number) {
        int result = number * number;
        System.out.println(number + " squared is " + result);
    }
}
