
/**
 * Write a description of class Aktionskarte here.
 *
 * @author Robin
 * @version 14.05.21
 */
public class Aktionskarte {
    private Aktionstyp aktionstyp;

    public Aktionskarte(Aktionstyp aktionstyp) {
        this.aktionstyp = aktionstyp;
    }

    public void aktion() {
        /*
         * Ruft die jeweilige Aktionsmethode der Aktionskarte auf.
         */
    }

    private void anwesenheitsliste() {
        /*
         * ANWESENHEITSLISTE
         * 
         * - BESCHREIBUNG: Es wird eine Anwesenheitsliste geführt, die Kunden feste
         * Plätze in der Warteschlange sichert.
         * 
         * - ANWEISUNGEN: Kehre die Reihenfolge der Spielfiguren vor einem Laden deiner
         * Wahl um, so dass die letzte die erste, die vorletzte die zweite usw. wird.
         */
    }

    private void bueckware() {
        /*
         * BÜCKWARE
         * 
         * - BESCHREIBUNG: Eine Bekannte, die in einem Laden arbeitet, verkauft dir
         * Ware, noch bevor der Laden öffnet.
         * 
         * - ANWEISUNGEN: Wähle einen Laden, vor dem sich eine deiner Spielfiguren an
         * der Spitze der Warteschlange befindet. Entferne Diese Spielfigur und nimm dir
         * eine Warenkarte aus dem Laden.
         */
    }

    private void freundImKomitee() {
        /*
         * FREUND IM KOMITEE
         * 
         * - BESCHREIBUNG: Ein Bekannter hat dir Informationen über die nächste
         * Warenlieferung gesteckt.
         * 
         * - ANWEISUNGEN: Sieh dir die beiden obersten Karten des Lieferkartenstapels
         * an.
         */
    }

    private void gluecklicherZufall() {
        /*
         * GLÜCKLICHER ZUFALL
         * 
         * - BESCHREIBUNG: Eine Bekannte musste ihr Kind vom Kindergarten abholen und
         * hat dir ihren Platz in der Warteschlange angeboten.
         * 
         * - ANWEISUNGEN: Nimm eine eigene Spielfigur aus einer Warteschlange heruas und
         * versetze sie auf die zweite Position einer anderen Warteschlange.
         */
    }

    private void groessereLieferung() {
        /*
         * GRÖßERE LIEFERUNG
         * 
         * - BESCHREIBUNG: Zur Überraschung aller ist die nächste Warenliefrung größer
         * ausgefallen als erwartet.
         * 
         * - ANWEISUNGEN: Lege eine weitere Warenkarte in den Laden, der zuletzt
         * beliefert wurde.
         */
    }

    private void inventur() {
        /*
         * INVENTUR
         * 
         * - BESCHREIBUNG: Ein Laden hat zwecks Inventur geschlossen.
         * 
         * - ANWEISUNGEN: Lege diese Aktionskarte auf einen Laden deiner Wahl. In diesem
         * Laden findet bis zum Ende der laufenden Runde kein Verkauf mehr statt.
         * 
         * Die Aktionskarten "Größere Lieferung" "Lieferfehler" und "Bückware" haben bis
         * dahin auf diesen Laden keine Auswirkung.
         */
    }

    private void kritikAnDerRegierung() {
        /*
         * KRITIK AN DER REGIERUNG
         * 
         * - BESCHREIBUNG: Irgendwer in der Warteschlange hat angefange, Kritik an der
         * Regierung und dem System zu äußern. Er musste sich daraufhin vor der Miliz
         * ausweisen. Das nutzen andere aus, um sich vorzudrängeln.
         * 
         * - ANWEISUNGEN: Versetze eine Spielfigur deiner Wahl innerhalb der
         * Warteschlange um zwei Positionen nach hinten.
         */
    }

    private void lieferfehler() {
        /*
         * LIEFERFEHLER
         * 
         * - BESCHREIBUNG: Der Fahrer des Lieferwagens hat sich in der Adresse geirrt.
         * 
         * - ANWEISUNGEN: Versetze eine Warenkarte aus einem Laden deiner Wahl in einen
         * anderen.
         */
    }

    private void mutterMitBaby() {
        /*
         * MUTTER MIT BABY
         * 
         * - BESCHREIBUNG: Du hast dir einen Säugling "geliehen". Nun hast du das Recht,
         * außer der Reihe dranzukommen.
         * 
         * - ANWEISUNGEN: Versetze eine eigene Spielfigur an die Spitze ihrer
         * Warteschlange.
         */
    }

    private void vordraengler() {
        /*
         * VORDRÄNGLER
         * 
         * - BESCHREIBUNG: Dir fällt auf, dass sich die Person vor dir vorgedrängelt
         * hat.
         * 
         * - ANWEISUNGEN: Versetzte eine eigene Spielfigur innerhalb derselben
         * Warteschlange um eine Position nach vorne.
         */
    }
}
