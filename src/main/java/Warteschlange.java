
/**
 * Write a description of class Warteschlange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Collections;

public class Warteschlange extends Liste {
    public Warteschlange() {
        super();
    }

    public void anstellen(Spielfigur f) {
        /*
         * Fügt die Spielfigur f hinten in der Warteschlange hinzu.
         */
        arrayList.add(f);
    }

    public Spielfigur entferneErsten() {
        /*
         * Entfernt vorderste Spielfigur (auf Position 1).
         */
        return (Spielfigur) arrayList.remove(0);
    }

    public Spielfigur entferne(int index) {
        /*
         * Entfernt Spielfigur an der angegebenen Stelle.
         */
        return (Spielfigur) arrayList.remove(index);
    }

    public void umgekehrt() {
        /*
         * Kehrt die Reihenfolge der Spielfiguren um.
         */
        Collections.reverse(arrayList);
    }

    public void bewege(int von, int zu) {
        /*
         * Bewegt die Spielfigur an der Stelle "von" zu der Stelle "zu".
         */
        Spielfigur f = (Spielfigur) arrayList.remove(von);
        arrayList.add(zu, f);
    }

    public void tausche(int i1, int i2) {
        /*
         * Tauscht die Spielfiguren an den Stellen i1 und i2.
         */
        Collections.swap(arrayList, i1, i2);
    }

    public Spielfigur gibErsteFigur() {
        /*
         * Gibt Spielfigur an erster Stelle zurück.
         */
        return (Spielfigur) arrayList.get(0);
    }
}
