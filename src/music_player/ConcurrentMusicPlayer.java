package music_player;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMusicPlayer {
  private MusicPlayer musicPlayer = new MusicPlayer();
  private final ExecutorService executor = Executors.newFixedThreadPool(2);
  private int sleepCnt = 0;
  private boolean enabled = false;
  private PlayerConfigInterface pc = null;

  private static void threadSleep(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public ConcurrentMusicPlayer(PlayerConfigInterface pci) {
    pc = pci;
    InputStream is = pc.getInputStream();
    enabled = is != null;
    executor.submit(
        () -> {
          if (enabled) musicPlayer.loadAndPlay(is);
          executor.shutdownNow();
        });
  }

  public void nextSentence() {
    if (enabled) threadSleep(pc.getDiff()[sleepCnt++]);
  }
}
