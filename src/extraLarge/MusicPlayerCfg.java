package extraLarge;

import java.io.InputStream;

import music_player.PlayerConfigInterface;

public class MusicPlayerCfg implements PlayerConfigInterface {
    private final static long TIMESTAMPS_DIFF[] =
        {16540, 15060, 14700, 7500, 1640, 2240, 3680, 1600, 2080, 2720, 1200, 11040, 4240, 7280,
         3760, 20400, 5920, 7840, 2880, 4960, 2800, 4480, 840, 1320, 2080, 3920, 1440, 1160, 5080,
         1200, 1360, 5020, 1300, 1320, 5140, 1140, 1480, 4060, 2140, 3280, 4280, 5620, 1900, 3480,
         3840, 4640, 3880, 3840, 4080, 3480, 3760, 3680, 3960, 3320, 2560, 1800, 2160, 3600, 1560,
         2120, 3960, 10840, 4360, 3560, 3920, 3800, 2120, 1760, 2000, 1760, 7360, 2000, 2160, 4480,
         6560};
    private final static String MUSIC_FILE_PATH = "resources/extraLarge.wav";
    
    @Override
    public long[] getDiff() {
        return TIMESTAMPS_DIFF;
    }

    @Override
    public InputStream getInputStream() {
        String envCIString = System.getenv("CI");
        return envCIString != null && envCIString.equals("true") ? null :
               sustainPlusPlus.class.getClassLoader().getResourceAsStream(MUSIC_FILE_PATH);
    }
}
