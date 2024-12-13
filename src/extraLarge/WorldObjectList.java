package extraLarge;

import java.util.LinkedList;
import java.util.Comparator;

public class WorldObjectList extends LinkedList<WorldObject> {
    public void sortAttribute(String attributeString) {
        switch(attributeString){
            case "beauty":
                System.out.println("If abstraction is the definition of beauty");
                break;
            default:
                break;
        };
        this.sort(Comparator.comparingInt(WorldObject::getBeauty));
    }

    public WorldObjectList getArtTags() {
        return null;
    }
}
