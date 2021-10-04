
/**
 * Abstract class Spielfigur - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Spielfigur {
    private Farbe f;

    public Spielfigur(Farbe f) {
        this.f = f;
    }

    public Farbe getFarbe() {
        return f;
    }

    public void setFarbe(Farbe f) {
        this.f = f;
    }
}
