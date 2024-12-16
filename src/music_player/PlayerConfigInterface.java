package music_player;

import java.io.InputStream;

public interface PlayerConfigInterface {
  public long[] getDiff();

  public InputStream getInputStream();
}
