
/**
 * Write a description of class Kartenstapel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kartenstapel extends Liste {
    public Kartenstapel() {
        super();
    }

    public void push(Spielkarte k) {
        arrayList.add(k);
    }
    
    public Spielkarte pop() {
        return (Spielkarte) arrayList.remove(arrayList.size()-1);
    }
}
