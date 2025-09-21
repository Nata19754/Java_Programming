//Write a program that prompts the user for data, creates a Wedding object, and displays all the details.

import java.util.Scanner;
import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bride info
        System.out.print("Enter bride's first name: ");
        String brideFirst = input.nextLine();
        System.out.print("Enter bride's last name: ");
        String brideLast = input.nextLine();

        // Groom info
        System.out.print("Enter groom's first name: ");
        String groomFirst = input.nextLine();
        System.out.print("Enter groom's last name: ");
        String groomLast = input.nextLine();

        // Location
        System.out.print("Enter location of wedding: ");
        String location = input.nextLine();

        // Date
        System.out.print("Enter wedding year: ");
        int year = input.nextInt();
        System.out.print("Enter wedding month: ");
        int month = input.nextInt();
        System.out.print("Enter wedding day: ");
        int day = input.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        // Create objects
        Person bride = new Person(brideFirst, brideLast);
        Person groom = new Person(groomFirst, groomLast);
        Couple couple = new Couple(bride, groom);
        Wedding wedding = new Wedding(couple, date, location);

        // Display wedding details
        System.out.println("\n--- Wedding Details <3 ---");
        System.out.println( wedding.getCouple().getBride().getLastName()
                + "/" + wedding.getCouple().getGroom().getLastName()
                + " Wedding");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName()
                + " " + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName()
                + " " + wedding.getCouple().getGroom().getLastName());
        System.out.println("Date : " + wedding.getDate());
        System.out.println("Location: " + wedding.getLocation());

        input.close();
    }
}
