/*
Create an Automobile class for a dealership. Include fields for an ID number (id), make (make),model (model), color (color), year (year), and miles per gallon (mpg).
Include get and set methods for each field. Do not allow the ID to be negative or more than 9999;
if it is, set the ID to 0. Do not allow the year to be earlier than 2005 or later than 2024; if it is, set
the year to 0. Do not allow the miles per gallon to be less than 10 or more than 60; if it is, set the
miles per gallon to 0. Include a default constructor that accepts no arguments and an overloaded constructor that accepts arguments for each field value and uses the set methods to assign the values.
*/

//Defined class
public class Automobile {

    // private fields
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;

    // default constructor which will set al fields to starting values
    public Automobile() {
        id = 0;
        make = "";
        model = "";
        color = "";
        year = 0;
        mpg = 0;
    }

    // overloaded constructor; take in the values for every field and I then used setter methods so that the validation rules can be applied
    public Automobile(int id, String make, String model, String color, int year, double mpg) {
        setId(id);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMpg(mpg);
    }

    // get methods; will return the value stored in each field
    public int getId() { return id; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getYear() { return year; }
    public double getMpg() { return mpg; }

    // set methods with validation
    // id must be between 0-9999 else 0
    public void setId(int id) {
        if (id >= 0 && id <= 9999) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public void setMake(String make) {
        if (make == null) make = "";
        this.make = make;
    }

    public void setModel(String model) {
        if (model == null) model = "";
        this.model = model;
    }

    public void setColor(String color) {
        if (color == null) color = "";
        this.color = color;
    }

    // year must be between 2005-2024 else 0
    public void setYear(int year) {
        if (year >= 2005 && year <= 2024) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    // mpg must be between 10-60 else 0
    public void setMpg(double mpg) {
        if (mpg >= 10 && mpg <= 60) {
            this.mpg = mpg;
        } else {
            this.mpg = 0;
        }
    }
}
