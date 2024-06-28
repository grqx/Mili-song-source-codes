package extraLarge;

import java.util.Iterator;
import java.util.HashSet;

public class OriginalSet<T> extends HashSet<T> {
    private String sepString = new String();
	// public Attribute toAttribute() {
	// 	return new Attribute();
	// }
    // public Attribute getAttr(String attributeString) {
    //     return new Attribute();
    // }
    public OriginalSet() {

    }
    public OriginalSet<T> getFirst() {
        Iterator<T> it = this.iterator();
        if(it.hasNext()){
            it.next();
        }
        return this;
    }

    public String setSepString(String sepString) {
        this.sepString = sepString;
        return this.sepString;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().toString());
            if (iterator.hasNext()) {
                sb.append(sepString);
            }
        }
        return sb.toString();
    }

    public Double getLove() {
        Double sumLove = 0.0;
        for (T t : this) {
            if(t instanceof Memory)
                sumLove += ((Memory) t).getLove();
        }
        return sumLove;
    }





}