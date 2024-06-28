package extraLarge;

import java.util.Random;

public class Relationship {
    private String RelationshipType = new String();
    private Life participant1 = null;
    private Life participant2 = null;
    private Integer sustain = null;
    
    public Relationship(Life participant1, Life participant2) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        sustain = 0;
    }

    public void end() {
        this.sustain = null;
        System.gc();
    }

    public void setSustain(Integer sustain) {
        this.sustain = sustain;
    }


    public void increaseSustain() {
        sustain++;
        System.out.println();
    }

    public void challenge() {
        if(new Random().nextBoolean())
            sustain--;
        else
            sustain++;
    }
}
