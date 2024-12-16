package music_player;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.io.File;

public class ConcurrentMusicPlayer {
    private MusicPlayer musicPlayer = new MusicPlayer();
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static int sleepCnt = 0;
    private static boolean enabled = false;
    private static PlayerConfigInterface pci = null;

    public ConcurrentMusicPlayer(PlayerConfigInterface pci_) {
        pci = pci_;
        File f = new File(pci.getFilePath());
        enabled = f.exists() && !f.isDirectory();
        executor.submit(() -> {
            if (enabled)
                musicPlayer.loadAndPlay(pci.getFilePath());
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
            threadSleep(pci.getDiff()[sleepCnt++]);
    }
}
