/*Write an application that prompts the user for a password that contains at least two uppercase letters,
at least three lowercase letters, and at least one digit. Continually prompt the user until a valid
password is entered. Display a message indicating whether the password is valid; if not, display the
reason the password is not valid. */

import java.util.Scanner;

public class ValidatePassword {

    public static void main(String[] args) {
        // Scanner to read input from user
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        // Loop that repeats until all password options are completed
        while (!valid) {
            // Prompt tp ask user to type a password with desired criteria
            System.out.print("Please enter a password that contains at least two uppercase letters,\n" +
                    "at least three lowercase letters, and at least one digit: ");
            String password = input.nextLine();

            String result = checkPassword(password);
            // if else statements, which will show whether password is valid or not. If not, it will state why.
            if (result.equals("")) {
                System.out.println("You have entered a VALID password.");
                valid = true;
            } else {
                System.out.println("Password is NOT valid because:");
                System.out.print(result);
                System.out.println();
            }
        }

        input.close();
    }
        //Counter which will check for our criterias
    public static String checkPassword(String pwd) {

        int upper = 0;
        int lower = 0;
        int digits = 0;

        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (Character.isUpperCase(c))
                upper++;
            else if (Character.isLowerCase(c))
                lower++;
            else if (Character.isDigit(c))
                digits++;
        }
        // string created which will hold any of the criterias that werent meet
        String problems = "";
        // checks criterias to know what to display in the string
        if (pwd.length() < 8)
            problems += "Password must be at least 8 characters long.\n";

        if (upper < 2)
            problems += "Password needs at least 2 uppercase letters.\n";

        if (lower < 3)
            problems += "Password needs at least 3 lowercase letters.\n";

        if (digits < 1)
            problems += "Password needs at least 1 digit.\n";
        //returns any issues found
        return problems;
    }
}