// Electric blanket extends Blanket and adds heat + auto shutoff
public class ElectricBlanket extends Blanket {
    private int settings;
    private boolean hasAutoShutoff;

    private static final int MIN_SETTINGS = 1;
    private static final int MAX_SETTINGS = 5;
    private static final double AUTO_PREMIUM = 5.75;

    // default electric blanket
    public ElectricBlanket() {
        super();
        this.settings = 1;
        this.hasAutoShutoff = false;
        computePrice();
    }

    // keep parent price logic
    @Override
    protected void computePrice() {
        super.computePrice();
    }

    // final price
    private double effectivePrice() {
        double p = BASE_PRICE;

        // size adds
        String s = getSize();
        if (s.equalsIgnoreCase("Double")) p += ADD_DOUBLE;
        else if (s.equalsIgnoreCase("Queen")) p += ADD_QUEEN;
        else if (s.equalsIgnoreCase("King")) p += ADD_KING;

        // material adds
        String m = getMaterial();
        if (m.equalsIgnoreCase("wool")) p += ADD_WOOL;
        else if (m.equalsIgnoreCase("cashmere")) p += ADD_CASHMERE;

        if (hasAutoShutoff) p += AUTO_PREMIUM;
        return p;
    }

    // setters with validation
    public void setSettings(int settings) {
        if (settings < MIN_SETTINGS || settings > MAX_SETTINGS) this.settings = 1;
        else this.settings = settings;
    }
    public void setHasAutoShutoff(boolean hasAutoShutoff) {
        this.hasAutoShutoff = hasAutoShutoff;
        computePrice();
    }

    // getters
    public int getSettings() { return settings; }
    public boolean isHasAutoShutoff() { return hasAutoShutoff; }

    @Override
    public String toString() {
        String shutTxt = hasAutoShutoff ? "automatic shutoff" : "no automatic shutoff";
        String settingWord = (settings == 1) ? "setting" : "settings";
        return String.format("%s size %s %s blanket.  Price $%.1f. %s and %d %s.",
                getSize().toLowerCase(), getColor(),
                getMaterial().toLowerCase(),
                effectivePrice(), shutTxt, settings, settingWord);
    }
}
