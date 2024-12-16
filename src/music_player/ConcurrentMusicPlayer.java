package music_player;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.io.File;

public class ConcurrentMusicPlayer {
    private MusicPlayer musicPlayer = new MusicPlayer();
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static int sleepCnt = 0;
    private static boolean enabled;
    public static long TIMESTAMPS_DIFF[];

    public ConcurrentMusicPlayer(long timestamps_diff[], String musicFilePath) {
        TIMESTAMPS_DIFF = timestamps_diff;
        File f = new File(musicFilePath);
        enabled = f.exists() && !f.isDirectory();
        executor.submit(() -> {
            if (enabled)
                musicPlayer.loadAndPlay(musicFilePath);
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
            threadSleep(TIMESTAMPS_DIFF[sleepCnt++]);
    }
}
