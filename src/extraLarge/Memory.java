package extraLarge;

public class Memory {
  private double love = 0.0;
  private Life memoryLife = null;

  public Memory(double love, Life memoryLife) {
    this.love = love;
    this.memoryLife = memoryLife;
  }

  public double getLove() {
    return this.love;
  }
}
