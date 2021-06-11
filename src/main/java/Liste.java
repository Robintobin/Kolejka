
/**
 * Abstract class Liste - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

import java.util.ArrayList;

public abstract class Liste {
    protected ArrayList arrayList;

    public Liste() {
        arrayList = new ArrayList();
    }

    public Object[] toArray() {
        return arrayList.toArray();
    }

    public Object gib(int index) {
        return arrayList.get(index);
    }
}
