//Create a class named Couple that contains two Person objects that represent a bride
//and a groom.
// Include a constructor that requires two Person objects.
// Include two get methods that each return a Person. Save the file as Couple.java

// Public class created which containes the required objects
public class Couple {
    // Two Person objects which represent a bride and a groom
    private Person bride;
    private Person groom;

    // Constructor which needs two Person objects
    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;
    }

    // Get methods return Person objects
    public Person getBride() {
        return bride;
    }

    public Person getGroom() {
        return groom;
    }
}

