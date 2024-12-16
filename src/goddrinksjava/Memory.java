package goddrinksjava;

import music_player.ConcurrentMusicPlayer;

/** Created by syuchan on 2016/10/17. */
public class Memory {
  public boolean isErasable() {
    ConcurrentMusicPlayer.nextSentence();
    System.out.println("FRAGMENTS");
    return true;
  }
}
