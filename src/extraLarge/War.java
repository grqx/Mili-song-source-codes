package extraLarge;

public class War {
  private Life warParticipant = null;

  public War(Life warParticipant, String descString) {
    this.warParticipant = warParticipant;
  }

  public double getScore(Life participantLife) {
    if (participantLife == warParticipant) {
      return 0.49;
    }
    return 0.5;
  }
}
