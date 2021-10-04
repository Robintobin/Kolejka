
/**
 * Write a description of class Einkaufszettel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Einkaufszettel extends Karte {
    private Warentyp[] warentypen = new Warentyp[4];

    public Einkaufszettel(Warentyp[] warentypen) {
        this.warentypen = warentypen;
    }

    public int gibAnzahl(Warentyp warentyp) {
        // [0] -> 4, [2] -> 3
        // 4-idx

        for (int i = 0; i < this.warentypen.length; i++) {
            if (this.warentypen[i] == warentyp) {
                return 4 - i;
            }
        }
        return 0;
    }

}