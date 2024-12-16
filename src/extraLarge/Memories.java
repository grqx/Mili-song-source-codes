package extraLarge;

import java.util.HashSet;

public class Memories extends HashSet<Memory> {
  public Double getLove() {
    Double sumLove = 0.0;
    for (Memory memory : this) {
      sumLove += memory.getLove();
    }
    return sumLove;
  }
}
