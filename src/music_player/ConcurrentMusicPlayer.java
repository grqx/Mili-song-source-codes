package music_player;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.InputStream;

public class ConcurrentMusicPlayer {
    private MusicPlayer musicPlayer = new MusicPlayer();
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static int sleepCnt = 0;
    private static boolean enabled = false;
    private static PlayerConfigInterface pc = null;

    public ConcurrentMusicPlayer(PlayerConfigInterface pci) {
        pc = pci;
        InputStream is = pc.getInputStream();
        enabled = is != null;
        executor.submit(() -> {
            if (enabled)
                musicPlayer.loadAndPlay(is);
            executor.shutdownNow();
        });
    }

    public static void threadSleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }

    public static void nextSentence() {
        if (enabled)
            threadSleep(pc.getDiff()[sleepCnt++]);
    }
}
