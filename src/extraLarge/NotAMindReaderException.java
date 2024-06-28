package extraLarge;

public class NotAMindReaderException extends Throwable{
    public NotAMindReaderException() {
        super();
    }

    // Constructor that accepts a message
    public NotAMindReaderException(String message) {
        super(message);
    }
}
