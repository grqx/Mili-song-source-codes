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

    public boolean SwitchMuxed() {
        muxed = !muxed;
        return this.getMuxed();
    }

    public Message Mux() {
        if(!muxed)
            this.SwitchMuxed();
        return this;
    }

    public Message Demux() throws InsufficientIntelligenceQuotientException{
        if(this.muxed){
            System.out.println("Can't you understand me?");
            throw new InsufficientIntelligenceQuotientException();
        }else return this;
    }


    public String getMessageContent() {
        return this.actualString;
    }
}
