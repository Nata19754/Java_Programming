/* Write an application called TestAutomobiles that declares two Automobile objects. Write a
function called enterData() that prompts the user for the data values for an Automobile object
and returns that object. When you test the program, be sure to enter some invalid data to
demonstrate that all the methods work correctly. */


import java.util.Scanner;

public class TestAutomobiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Tell user what program does
        System.out.println("------ Auto Info Entry Program ------");

        // Ask user to enter info for 1st auto
        System.out.println("\nEnter data for Automobile 1:");
        Automobile a1 = enterData(sc);

        //Ask user to enter info for 2nd auto
        System.out.println("\nEnter data for Automobile 2:");
        Automobile a2 = enterData(sc);

        //Display both autos
        System.out.println("\n------ Automobile Information ------");
        displayAutoInfo(a1);
        System.out.println("------------------------------");
        displayAutoInfo(a2);

        sc.close();
        System.out.println("\nDone.");
    }

    // Prompts user and returns a filled Automobile object
    public static Automobile enterData(Scanner sc) {
        Automobile auto = new Automobile();

        System.out.print("ID (Integer between 0-9999): ");
        String idText = sc.nextLine().trim();
        int idValue;
        try {
            idValue = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Setting ID to 0.");
            idValue = 0;
        }

        System.out.print("Make: ");
        String makeValue = sc.nextLine().trim();

        System.out.print("Model: ");
        String modelValue = sc.nextLine().trim();

        System.out.print("Color: ");
        String colorValue = sc.nextLine().trim();

        System.out.print("Year ( Integer between 2005-2024): ");
        String yearText = sc.nextLine().trim();
        int yearValue;
        try {
            yearValue = Integer.parseInt(yearText);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer. Setting Year to 0.");
            yearValue = 0;
        }

        System.out.print("MPG ( Integer between 10-60): ");
        String mpgText = sc.nextLine().trim();
        double mpgValue;
        try {
            mpgValue = Double.parseDouble(mpgText);
        } catch (NumberFormatException e) {
            System.out.println("Invalid decimal. Setting MPG to 0.");
            mpgValue = 0;
        }

        // Use setters so validation rules are applied
        auto.setId(idValue);
        auto.setMake(makeValue);
        auto.setModel(modelValue);
        auto.setColor(colorValue);
        auto.setYear(yearValue);
        auto.setMpg(mpgValue);


        return auto;
    }

    // prints the automobile info in its own line and uses the get methods to retrieve the values
    public static void displayAutoInfo(Automobile a) {
        System.out.println("ID: " + a.getId());
        System.out.println("Make: " + a.getMake());
        System.out.println("Model: " + a.getModel());
        System.out.println("Color: " + a.getColor());
        System.out.println("Year: " + a.getYear());
        System.out.println("MPG: " + a.getMpg());
    }
}
