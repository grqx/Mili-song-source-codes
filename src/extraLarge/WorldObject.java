package extraLarge;

import java.util.ArrayList;

public class WorldObject {
  private ArrayList<String> artTags = new ArrayList<String>();
  private int beauty = 0;

  public ArrayList<String> getArtTags() {
    artTags.add("abstract");
    artTags.add("beauty");
    World.concurrentMusicPlayer.nextSentence();
    System.out.println("Are those of us chasing after clarity");
    return artTags;
  }

  public int getBeauty() {
    return beauty;
  }

  public int toInt() {
    return beauty;
  }
}
