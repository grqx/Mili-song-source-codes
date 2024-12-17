package goddrinksjava;

/** Created by syuchan on 2016/10/17. */
public class Opinion {
  private String opinionString;
  private boolean believed = false;

  public Opinion(String opinionString, boolean believed) {
    this.opinionString = opinionString;
    this.believed = believed;
  }

  public String getOpinionString() {
    return opinionString;
  }

  public boolean getBelieved() {
    return believed;
  }

  public void disbelieve() {
    believed = false;
  }
}
