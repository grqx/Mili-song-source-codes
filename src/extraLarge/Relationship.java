package extraLarge;

import java.util.Objects;
import java.util.Random;

public class Relationship {
  private Life participant1 = null;
  private Life participant2 = null;
  private Integer sustain = null;

  public Relationship(Life participant1, Life participant2) {
    this.participant1 = participant1;
    this.participant2 = participant2;
    sustain = 100;
  }

  public void end() {
    sustain = null;
  }

  public void setSustain(Integer sustain) {
    this.sustain = sustain;
  }

  public void increaseSustain() {
    if (sustain != null) sustain++;
    else sustain = 1;
    System.out.println();
    System.out.println();
  }

  public void challenge() {
    if (new Random().nextBoolean()) sustain--;
    else sustain++;
  }

  @Override
  public boolean equals(Object anObject) {
    if (this == anObject) return true;
    return (anObject instanceof Relationship aRelationship)
        && participant1 == aRelationship.participant1
        && participant2 == aRelationship.participant2;
  }

  @Override
  public int hashCode() {
    return Objects.hash(participant1, participant2);
  }
}
