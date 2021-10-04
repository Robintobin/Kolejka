
/**
 * Abstract class Laden - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Laden {
    private Warteschlange warteschlange;

    public void gibErstePosition() {
        /*
         * Gibt Spieler/Schwarzmarkt der Spielfigur an erster Stelle zurück.
         */
        if (warteschlange.gibErsteFigur() instanceof Spielerfigur) {
            // SPIELER
        } else {
            // Schwarzmarkt für Arme
        }
    }
}
