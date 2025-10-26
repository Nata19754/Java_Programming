// Creates a normal blanket with size, color, and material
public class Blanket {
    // data
    private String size;
    private String color;
    private String material;
    private double price;

    // prices
    protected static final double BASE_PRICE   = 30.00;
    protected static final double ADD_DOUBLE   = 10.00;
    protected static final double ADD_QUEEN    = 25.00;
    protected static final double ADD_KING     = 40.00;
    protected static final double ADD_WOOL     = 20.00;
    protected static final double ADD_CASHMERE = 45.00;

    // default: twin, white, cotton
    public Blanket() {
        this.size = "Twin";
        this.color = "white";
        this.material = "cotton";
        computePrice();
    }

    // compute total price using size ands material
    protected void computePrice() {
        double p = BASE_PRICE;

        if (size.equalsIgnoreCase("Double")) p += ADD_DOUBLE;
        else if (size.equalsIgnoreCase("Queen")) p += ADD_QUEEN;
        else if (size.equalsIgnoreCase("King")) p += ADD_KING;
        else if (!size.equalsIgnoreCase("Twin")) size = "Twin";

        if (material.equalsIgnoreCase("wool")) p += ADD_WOOL;
        else if (material.equalsIgnoreCase("cashmere")) p += ADD_CASHMERE;
        else if (!material.equalsIgnoreCase("cotton")) {
            // invalid -> reset to defaults
            material = "cotton";
            color = "white";
            size = "Twin";
            p = BASE_PRICE;
        }

        price = p;
    }

    // setters
    public void setSize(String size) {
        this.size = (size == null) ? "Twin" : size.trim();
        computePrice();
    }
    public void setColor(String color) {
        this.color = (color == null || color.trim().isEmpty()) ? "white" : color.trim();
    }
    public void setMaterial(String material) {
        this.material = (material == null) ? "cotton" : material.trim();
        computePrice();
    }

    // getters
    public String getSize()     { return size; }
    public String getColor()    { return color; }
    public String getMaterial() { return material; }
    public double getPrice()    { return price; }

    @Override
    public String toString() {
        return String.format("%s size %s %s blanket.  Price $%.1f",
                size.toLowerCase(), color, material.toLowerCase(), price);
    }
}
