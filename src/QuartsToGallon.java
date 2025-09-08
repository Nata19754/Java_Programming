// This is part 1 of assignment 2 of Java programming Fall 2025

public class QuartsToGallon {
    public static void main(String [] arg){

        //Created a constant and gave it a value
        final int QUARTS_PER_GALLON = 4;
        int quartsNeeded = 18; // Value given in assignment

        int gallons = quartsNeeded / QUARTS_PER_GALLON;
        int quarts = quartsNeeded % QUARTS_PER_GALLON;

        // Added spaces before and after string so that final print out displays properly
        System.out.println(" A job that needs " + quartsNeeded + " quarts required " + gallons +" gallons plus " + quarts + " quarts ");

    }
}