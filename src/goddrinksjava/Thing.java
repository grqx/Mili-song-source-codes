package goddrinksjava;

import java.util.HashSet;
import java.util.Set;
import music_player.ConcurrentMusicPlayer;

/** Created by syuchan on 2016/10/17. */
public class Thing implements PointSet, Circle, SineWave, Sequence, Eggplant, Tomato, TabbyCat {
  private String name;
  private Set<Attribute> attributes = new HashSet<>();
  private OriginalSet<Dimension> dimensions = new OriginalSet<>();
  private Circumference circumference = new Circumference();
  private Set<Action> actions = new HashSet<>();
  private Set<Feeling> feelings = new HashSet<>();
  private Limit limit = new Limit();
  private boolean see = true;
  private Satisfaction satisfaction = new Satisfaction();
  private OriginalSet<Nutrient> nutrients = new OriginalSet<>();
  private OriginalSet<Antioxidant> antioxidants = new OriginalSet<>();
  private Proof proof = new Proof();
  private Set<Sense> senses = new HashSet<>();
  private Memory memory = new Memory();
  private Opinion opinion = new Opinion("none", false);
  private Set<Opinion> opinions = new HashSet<>();
  private Execution execution = new Execution();
  private int lookForCount = 0;
  private int addAttributeCount = 0;
  public static ConcurrentMusicPlayer concurrentMusicPlayer =
      new ConcurrentMusicPlayer(new MusicPlayerCfg());

  public Thing(String name) {
    this.name = name;
    if (name.equals("Me")) {
      concurrentMusicPlayer.nextSentence();
      System.out.println("Switch on the power line");
      concurrentMusicPlayer.nextSentence();
      System.out.println("Remember to put on");
      concurrentMusicPlayer.nextSentence();
      System.out.println("PROTECTION");
    } else {
      concurrentMusicPlayer.nextSentence();
      System.out.println("Lay down your pieces");
      concurrentMusicPlayer.nextSentence();
      System.out.println("And let's begin");
    }
    senses.add(Sense.VIBRATION);
  }

  public String getName() {
    return name;
  }

  public void addAttribute(Attribute attribute) {
    concurrentMusicPlayer.nextSentence();
    System.out.print("Then I will give you");
    addAttributeCount++;
    if (addAttributeCount != 4) {
      System.out.print(" my");
    }
    System.out.println();
    attributes.add(attribute);
  }

  public void addAction(String name, double var1) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then you can sit on all my");
    concurrentMusicPlayer.nextSentence();
    System.out.println("TANGENTS");
    actions.add(new Action(name, var1));
  }

  public void toggleCurrent() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Switch my current");
    concurrentMusicPlayer.nextSentence();
    System.out.println("To AC, to DC");
  }

  public void canSee(boolean see) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("And then blind my vision");
    this.see = see;
  }

  public void addFeeling(String feeling) {
    Feeling feel = Feeling.valueOf(feeling.toUpperCase());
    switch (feel) {
      case DIZZY:
        concurrentMusicPlayer.nextSentence();
        System.out.println("So dizzy, so dizzy");
        break;
      case COMPLETE:
        concurrentMusicPlayer.nextSentence();
        System.out.println("Then I can");
        concurrentMusicPlayer.nextSentence();
        System.out.println("Then I can finally be");
        concurrentMusicPlayer.nextSentence();
        System.out.println("COMPLETION");
        break;
      default:
        break;
    }
    feelings.add(feel);
  }

  public void removeFeeling(String feeling) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then maybe");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then maybe you won't leave me so");
    Feeling feel = Feeling.valueOf(feeling.toUpperCase());
    concurrentMusicPlayer.nextSentence();
    System.out.println(feel.name());
    feelings.remove(feel);
  }

  public int getNumStimulationsAvailable() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can");
    return 0;
  }

  public int getNumStimulationsNeeded() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can give you all the");
    concurrentMusicPlayer.nextSentence();
    System.out.println("STIMULATIONS");
    return 0;
  }

  public void setSatisfaction(Satisfaction satisfaction) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("SATISFACTION");
    this.satisfaction = satisfaction;
  }

  public Satisfaction toSatisfaction() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then I can");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then I can be your only");
    return satisfaction;
  }

  public int getFeelingIndex(String feeling) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can make you happy");
    concurrentMusicPlayer.nextSentence();
    System.out.println("I will run the");
    Feeling feel = Feeling.valueOf(feeling.toUpperCase());
    return feelings.contains(feel) ? -1 : 1;
  }

  public void requestExecution(World world) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("EXECUTION");
  }

  public Proof toProof() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then you're the proof of my");
    return proof;
  }

  public void setProof(Proof proof) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("EXISTENCE\n");
    this.proof = proof;
  }

  public void toggleGender() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Switch my gender");
    concurrentMusicPlayer.nextSentence();
    System.out.println("To F, to M");
  }

  public void toggleRoleBDSM() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Oh, switch my role");
    concurrentMusicPlayer.nextSentence();
    System.out.println("To S, to M");
  }

  public boolean getSenseIndex(String sense) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can");
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can feel your");
    Sense s = Sense.valueOf(sense.toUpperCase());
    concurrentMusicPlayer.nextSentence();
    System.out.println(s.name() + "S");
    return senses.contains(s);
  }

  public void lookFor(Thing thing, World world) {
    lookForCount++;
    if (lookForCount == 5) {
      concurrentMusicPlayer.nextSentence();
      System.out.println("You have left me in");
      concurrentMusicPlayer.nextSentence();
      System.out.println("ISOLATION");
    } else {
      concurrentMusicPlayer.nextSentence();
      System.out.println("You have left");
    }
  }

  public Memory getMemory() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can");
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I can erase all the pointless");
    return memory;
  }

  public int getOpinionIndex(String var1) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Challenging your god");
    Opinion[] opinions = this.opinions.toArray(new Opinion[0]);
    for (int i = 0; i < opinions.length; i++) {
      if (opinions[i].getVar1().equalsIgnoreCase(var1)) return i;
    }
    return -1;
  }

  public void setOpinion(int index, boolean var1) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("You have made some");
    if (index == -1) throw new IllegalArgumentException();
    this.opinion = new Opinion(((Opinion) opinions.toArray()[index]).getVar1(), var1);
  }

  public void setExecution(Execution execution) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then I can");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then I can be your only");
    concurrentMusicPlayer.nextSentence();
    System.out.println("EXECUTION");
    this.execution = execution;
  }

  public Execution toExecution() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("EXECUTION");
    return execution;
  }

  public void escape(World world) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Though we are trapped");
    concurrentMusicPlayer.nextSentence();
    System.out.println("We are trapped ah\n");
  }

  public void escape(String topic) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Though you are free");
    concurrentMusicPlayer.nextSentence();
    System.out.println("I am trapped");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Trapped in");
    concurrentMusicPlayer.nextSentence();
    System.out.println("LO-O-OVE\n");
  }

  public void learnTopic(String string) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("I've studied");
    concurrentMusicPlayer.nextSentence();
    System.out.println("I've studied how to properly");
    concurrentMusicPlayer.nextSentence();
    System.out.println("LO-O-OVE");
  }

  public void takeExamTopic(String string) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("Question me");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Question me, I can answer all");
    concurrentMusicPlayer.nextSentence();
    System.out.println("LO-O-OVE");
  }

  public void getAlgebraicExpression(String string) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("I know the algebraic expression of");
    concurrentMusicPlayer.nextSentence();
    System.out.println("LO-O-OVE");
  }

  @Override
  public OriginalSet<Dimension> getDimensions() {
    concurrentMusicPlayer.nextSentence();
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm a set of points");
    return dimensions;
  }

  @Override
  public void resetDimensions() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("DIMENSION");
    dimensions.clear();
  }

  @Override
  public Circumference getCircumference() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm a circle");
    return circumference;
  }

  @Override
  public void resetCircumference() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("CIRCUMFERENCE");
    circumference = null;
  }

  @Override
  public double getXPosition() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm a sine wave");
    return 0;
  }

  @Override
  public double getTangent(double var1) {
    return Math.tan(var1);
  }

  @Override
  public void setLimit(Limit limit) {
    concurrentMusicPlayer.nextSentence();
    System.out.println("LIMITATIONS\n");
    this.limit = limit;
  }

  @Override
  public Limit toLimit() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I approach infinity");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then you can be my");
    return limit;
  }

  @Override
  public OriginalSet<Nutrient> getNutrients() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm an eggplant");
    return nutrients;
  }

  @Override
  public void resetNutrients() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("NUTRIENTS");
    nutrients.clear();
  }

  @Override
  public OriginalSet<Antioxidant> getAntioxidants() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm a tomato");
    return antioxidants;
  }

  @Override
  public void resetAntioxidants() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("ANTIOXIDANTS");
    antioxidants.clear();
  }

  @Override
  public void purr() {
    concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm a tabby cat");
    concurrentMusicPlayer.nextSentence();
    System.out.println("Then I will purr for your");
    concurrentMusicPlayer.nextSentence();
    System.out.println("ENJOYMENT");
  }
}
