//Create a class named Wedding for a wedding planner.
// The class includes the date of the wedding, the names of the Couple being married, and a String for the location
//Provide a constructor that requires a Couple, a LocalDate, and a String that contains data about a Wedding event.
// Include get methods that return the Couple, the LocalDate, and the String that represents the location.

import java.time.LocalDate;

// Class created
public class Wedding {
    // Wedding info which oncludes couple, date , and the location
    private Couple couple;
    private LocalDate date;
    private String location;

    // Constructor which needs Couple, LocalDate, and location String
    public Wedding(Couple couple, LocalDate date, String location) {
        this.couple = couple;
        this.date = date;
        this.location = location;
    }

    // Get methods for couple, date, and location
    public Couple getCouple() {
        return couple;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}
