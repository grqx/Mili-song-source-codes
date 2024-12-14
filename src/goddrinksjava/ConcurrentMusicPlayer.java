package goddrinksjava;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMusicPlayer {
    private MusicPlayer musicPlayer = new MusicPlayer();
    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static int sleepCnt = 0;
    private final static long timestamps_delta[] =
        {100, 1640, 1180, 953, 1618, 889, 1066, 2645, 1004, 1811, 985, 2109, 13709, 1407, 1566,
         730, 1234, 1641, 780, 1529, 1453, 657, 1640, 1161, 945, 1398, 1822, 1862, 1829, 1862,
         1858, 1833, 2307, 464, 2271, 631, 946, 1862, 1204, 1651, 1007, 825, 1680, 1405, 876, 1377,
         1537, 617, 1650, 1394, 731, 1482, 1435, 810, 1460, 1384, 665, 1610, 1818, 1938, 1512,
         2274, 1610, 2125, 2015, 708, 2096, 927, 683, 2318, 679, 1320, 880, 1080, 740, 860, 1494,
         1059, 646, 1881, 868, 986, 2176, 818, 2953, 2563, 16436, 940, 920, 1020, 980, 760, 880,
         820, 1220, 880, 960, 960, 900, 421, 336, 587, 449, 431, 460, 1048, 683, 1851, 850, 1006,
         1889, 913, 2044, 844, 931, 1332, 2271, 927, 1756, 928, 1044, 1745, 894, 3125, 818, 1263,
         1055, 555, 14455};
    public ConcurrentMusicPlayer() {
        executor.submit(() -> {
            musicPlayer.loadAndPlay("media/goddrinksjava.wav");
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
        threadSleep(timestamps_delta[sleepCnt++]);
    }
}
