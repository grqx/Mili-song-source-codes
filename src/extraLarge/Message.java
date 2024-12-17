package extraLarge;

public class Message {
  private String actualString = new String();
  private boolean muxed = false;

  public Message(String actualString) {
    this.actualString = actualString;
  }

  public boolean getMuxed() {
    return muxed;
  }

  public boolean switchMuxed() {
    muxed = !muxed;
    return this.getMuxed();
  }

  public Message Mux() {
    if (!muxed) this.switchMuxed();
    return this;
  }

  public Message demux() throws InsufficientIntelligenceQuotientException {
    if (this.muxed) {
      throw new InsufficientIntelligenceQuotientException();
    } else return this;
  }

  public String getMessageContent() {
    return this.actualString;
  }
}
