package extraLarge;

import java.util.Comparator;
import java.util.LinkedList;

public class WorldObjectList extends LinkedList<WorldObject> {
  public void sortAttribute(String attributeString) {
    switch (attributeString) {
      case "beauty":
        World.concurrentMusicPlayer.nextSentence();
        System.out.println("If abstraction is the definition of beauty");
        break;
      default:
        break;
    }
    ;
    this.sort(Comparator.comparingInt(WorldObject::getBeauty));
  }

  public WorldObjectList getArtTags() {
    return null;
  }
}
