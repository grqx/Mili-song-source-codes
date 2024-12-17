package extraLarge;

import music_player.ConcurrentMusicPlayer;

public class Simulation {
  Life me = null;
  World world = null;
  Integer year = null;
  Integer time = null;

  public Simulation(Life me, World world, Integer year, Integer time) {
    this.me = me;
    this.world = world;
    this.year = year;
    this.time = time;
    World.concurrentMusicPlayer.nextSentence();
    System.out.println("If we can be completely simulated");
  }

  public Integer compareToOriginal(Life me) {
    return 100;
  }
}
