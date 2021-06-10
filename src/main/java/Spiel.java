public class Spiel {

    public void spielverlauf() {
        // while (!spielVorbei()) {}
        anstellenInDenWarteschlangen();
        warenlieferung();
        draengelei();
        ladenoeffnung();
        tauschenAufDemMarkt();
        aufraeumphase();
        // if (wocheVorbei()) {}
        samstag();
    }

    public void anstellenInDenWarteschlangen() {
        /*
         * Phase 1: ANSTELLEN IN DEN WARTESCHLANGEN
         * 
         * Beginnend mit dem Startspieler setzen die Spieler reihum im Uhrzeigerseinn
         * jeweils eine ihrer freien Spielfiguren vor einen Laden ihrer Wahl oder vor
         * den Markt, bis sich alle Spielfiguren auf dem Spielplan befinden. Sobald dies
         * der Fall ist, beginnt die nächste Phase.
         */
        // gibt an, ob einer der Spieler noch Spielfiguren setzen kann
        boolean jemandKannSetzen = true;

        while (jemandKannSetzen) {
            jemandKannSetzen = false;
            for (Spieler spieler : spielerListe) {
                if (spieler.hatFreieSpielfigur()) {
                    spieler.setzeSpielfigur();
                }
                // IF nachdem gesetzt wurde immer noch freie Spielfigur
                if (spieler.hatFreieSpielfigur()) {
                    // nicht aufhören
                    jemandKannSetzen = true;
                }
            }
        }

    }

    public void warenlieferung() {
        /*
         * Phase 2. WARENLIEFERUNG
         * 
         * • Der Spielleiter zieht die obersten 3 Karten des Lieferkartenstapels und
         * legt sie offen auf die vorgesehenen Felder in der Spielplanmitte aus.
         * 
         * • Daraufhin bestückt er die Läden gemäß der Angaben auf den Lieferkarten mit
         * Warenkarten, solange der Vorrat reicht.
         * 
         * Die Warenkarten werden so in die Läden gelegt, dass ihre Namen gut sichtbar
         * sind.
         */
        Lieferkarten[] lieferkarten = lieferkartenStapel.getObersteDrei();
        for (Lieferkarte lieferkarte : lieferkarten) {
            Warentyp warentyp = lieferkarte.getTyp();
            int anzahl = lieferkarte.getAnzahl();

            Laden laden = laeden.vomTyp(warentyp); // laden mit dem Warentyp
            laden.addWare(anzahl);
        }
    }

    public void draengelei() {
        /*
         * Phase 3. DRÄNGELEI
         * 
         * In dieser Phase spielen die Spieler ihre Handkarten aus. Es beginnt der
         * Startspieler, die anderen Spieler folgen reihum im Uhrzeigersinn. Wer an der
         * Reihe ist, hat zwei Möglichkeiten:
         * 
         * 1. Er spielt eine seiner Aktionskarten aus der Hand. Dazu legt er sie offen
         * auf das Ablagefeld für Aktionskarten auf dem Spielplan und führt ihre Aktion
         * aus.
         * 
         * 2. Er kann oder möchte keine Handkarte spielen und passt.
         * 
         * Achtung! Wer passt, darf keine weiteren Handkarten mehr spielen. Er legt
         * seine übrigen Handkarten zurück auf seinen Nachziehstapel.
         * 
         * Dies wird so lange fortgesetzt, bis alle Spieler ihre Handkarten entweder
         * ausgespielt oder durch Passen zurück auf ihren Nachziehstapel gelegt haben.
         * Danach endet diese Phase.
         */

    }

    public void ladenoeffnung() {
        /*
         * Phase 4. LADENÖFFNUNG
         * 
         * In dieser Phase werden die Waren aus den Läden verkauft. Alle Läden werden
         * gleichzeitig abgehandelt. Die Vergabe der Warenkarten orientiert sich an den
         * Positionen der Spielfiguren in den Warteschlangen. Vor jedem Laden darf sich
         * der Inhaber der vordersten Figur zuerst eine Warenkarte seiner Wahl aus dem
         * entsprechenden Laden nehmen. Danach entfernt er seine Spielfigur aus der
         * Schlange. Dies wird so lange fortgesetzt, bis entweder alle Warenkarten eines
         * Ladens verteilt sind oder keine Figuren mehr vor dem Laden stehen. Eventuell
         * übrig gebliebene Warenkarten bleiben für die Folgerunden im Laden liegen.
         * Seine Warenkarten muss jeder Spieler gut sichtbar vor sich ablegen. Sobald
         * ein Spieler alle Waren einer Sorte zusammen hat, die auf seinem
         * Einkaufszettel stehen, legt er sie als verdeckten Stapel vor sich ab. Dadurch
         * kann jeder Spieler den Fortschritt der anderen mit einem Blick erfassen. Der
         * 
         * Spekulant: Sobald die schwarze Spekulantenfigur an die Reihe kommt, wird eine
         * Warenkarte des entsprechenden Ladens auf den Markt gelegt. Dort wird sie auf
         * dasselbe Feld gelegt, auf das beim Spielaufbau eine Karte gleicher Farbe
         * gelegt wurde. Danach wird der Spekulant an das Ende der Warteschlange
         * gestellt.
         */
    }

    public void tauschenAufDemMarkt() {
        /*
         * Phase 5. TAUSCHEN AUF DEM MARKT
         * 
         * Jeder Spieler, der noch Spielfiguren vor dem Markt stehen hat, darf nun auf
         * dem Markt beliebig oft tauschen. Die Spielreihenfolge orientiert sich wieder
         * nach den Positionen der Spielfiguren in der Schlange vor dem Markt. Getauscht
         * wird im Verhältnis 2:1. Die abgegebenen Warenkarten werden auf die beim
         * Spielaufbau festgelegten Felder gelegt. Es darf jede auf dem Markt vorhandene
         * Ware genommen werden. Waren, auf denen die Marktfrauenfigur steht, dürfen im
         * Verhältnis 1:1 ertauscht werden. Nachdem ein Spieler alle Tauschaktionen
         * abgeschlossen hat, entfernt er seine Spielfigur aus der Schlange und der
         * nächste Spieler ist an der Reihe.
         * 
         * Achtung! Auf dem Markt gibt es keine Reglementierung. Das bedeutet, dass man
         * mit einer Spielfigur mehr als eine Ware nach Hause bringen darf (anders als
         * vor den Läden, wo jede Figur nur eine Ware heimbringt).
         * 
         * Möchte ein Spieler in der laufenden Runde nicht tauschen, darf er passen und
         * seine Spielfigur entweder vor dem Markt stehen lassen oder sie zurücknehmen.
         * Auf jeden Fall kommt dann der nächste Spieler in der Schlange an die Reihe.
         */
    }

    public void aufraeumphase() {
        /*
         * Phase 6. AUFRÄUMPHASE
         * 
         * Am Ende jeder Runde werden folgende Vorbereitungen für die nächste Runde
         * getroffen:
         * 
         * 1. Der Spielleiter legt die Lieferkarten dieser Runde verdeckt auf das
         * Papierkorb-Feld auf dem Spielplan.
         * 
         * 2. In den Läden ausliegende „Inventur“-Karten werden auf den Ablagestapel für
         * Aktionskarten gelegt.
         * 
         * 3. Die Marktfrauenfigur wird auf das nächste Marktfeld versetzt. Befand sie
         * sich bereits auf dem letzten Marktfeld (gekennzeichnet mit einem „R“), werden
         * sofort die im Abschnitt „Samstag“ beschriebenen Aktionen ausgeführt.
         * 
         * 4. Jeder Spieler nimmt die obersten 3 Karten seines Nachziehstapels auf die
         * Hand. Ist oder wird dabei sein Nachziehstapel leer, so nimmt er keine
         * weiteren Karten auf. Kein Spieler darf mehr als 3 Handkarten besitzen. Zudem
         * dürfen alle Spieler beliebig viele ihrer Spielfiguren vom Spielplan nehmen.
         * 
         * 5. Der Startspielerstein wird im Uhrzeigersinn weitergegeben. Danach beginnt
         * eine neue Runde mit ihren 6 Phasen.
         */
    }

    public void samstag() {
        /*
         * SAMSTAG
         * 
         * Mit dem Ende der 5. Runde endet auch die Arbeitswoche. Auf dem Spielplan muss
         * ein wenig aufgeräumt werden. Dazu bestimmt der Spielleiter, welche Spieler
         * ihm dabei zur Hand gehen sollen. Folgende Dinge sind zu erledigen:
         * 
         * 1. Der Papierkorb muss geleert werden, d. h. alle dort abgelegten
         * Lieferkarten müssen gemischt und wieder verdeckt bereitgelegt werden.
         * 
         * 2. Die ausgespielten Aktionskarten werden ihren Besitzern zurückgegeben.
         * Danach werden sie von ihren Besitzern gemischt und unter den Nachziehstapel
         * gelegt. War der Nachziehstapel bereits aufgebraucht, werden die gemischten
         * Karten als neuer Nachziehstapel bereitgelegt.
         * 
         * 3. Die Marktfrauenfigur wird auf das erste Marktfeld zurückgesetzt. Danach
         * fährt man fort mit dem 4. Punkt der Aufräumphase.
         */
    }
}
