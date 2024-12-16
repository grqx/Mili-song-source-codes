package extraLarge;

import java.util.LinkedList;
import java.util.Comparator;

import music_player.ConcurrentMusicPlayer;

public class WorldObjectList extends LinkedList<WorldObject> {
    public void sortAttribute(String attributeString) {
        switch(attributeString){
            case "beauty":
                ConcurrentMusicPlayer.nextSentence();
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
