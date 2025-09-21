//Create a class named Person that holds two String objects for the person’s first and last name.
//Include a constructor that requires an argument for each field.
// Include get methods for each field. Save the file as Person.java

// Person class created that stores the first and last name
public class Person {
    // Stores first and last name
    private String firstName;
    private String lastName;

    // Constructor included that requires an argument
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Get methods for each field
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

