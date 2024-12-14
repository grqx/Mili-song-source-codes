package goddrinksjava;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by syuchan on 2016/10/17.
 */
public class Thing implements PointSet, Circle, SineWave, Sequence, Eggplant, Tomato, TabbyCat {
	private static ConcurrentMusicPlayer concurrentMusicPlayer = new ConcurrentMusicPlayer();
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

	public Thing(String name) {
		this.name = name;
		if (name.equals("Me")) {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("Switch on the power line");
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("Remember to put on");
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("PROTECTION");
		} else {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("Lay down your pieces");
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("And let's begin");
		}
		senses.add(Sense.VIBRATION);
	}

	public String getName() {
		return name;
	}

	public void addAttribute(Attribute attribute) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.print("Then I will give you");
		addAttributeCount++;
		if (addAttributeCount != 4) {
			System.out.print(" my");
		}
		System.out.println();
		attributes.add(attribute);
	}

	public void addAction(String name, double var1) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then you can sit on all my");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("TANGENTS");
		actions.add(new Action(name, var1));
	}

	public void toggleCurrent() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Switch my current");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("To AC, to DC");
	}

	public void canSee(boolean see) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("And then blind my vision");
		this.see = see;
	}

	public void addFeeling(String feeling) {
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		switch (feel) {
			case DIZZY:
				ConcurrentMusicPlayer.nextSentence();
				System.out.println("So dizzy, so dizzy");
				break;
			case COMPLETE:
				ConcurrentMusicPlayer.nextSentence();
				System.out.println("Then I can");
				ConcurrentMusicPlayer.nextSentence();
				System.out.println("Then I can finally be");
				ConcurrentMusicPlayer.nextSentence();
				System.out.println("COMPLETION");
				break;
			default:
				break;
		}
		feelings.add(feel);
	}

	public void removeFeeling(String feeling) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then maybe");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then maybe you won't leave me so");
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		ConcurrentMusicPlayer.nextSentence();
		System.out.println(feel.name());
		feelings.remove(feel);
	}

	public int getNumStimulationsAvailable() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can");
		return 0;
	}

	public int getNumStimulationsNeeded() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can give you all the");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("STIMULATIONS");
		return 0;
	}

	public void setSatisfaction(Satisfaction satisfaction) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("SATISFACTION");
		this.satisfaction = satisfaction;
	}

	public Satisfaction toSatisfaction() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then I can");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then I can be your only");
		return satisfaction;
	}

	public int getFeelingIndex(String feeling) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can make you happy");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("I will run the");
		Feeling feel = Feeling.valueOf(feeling.toUpperCase());
		return feelings.contains(feel) ? -1 : 1;
	}

	public void requestExecution(World world) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("EXECUTION");
	}

	public Proof toProof() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then you're the proof of my");
		return proof;
	}

	public void setProof(Proof proof) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("EXISTENCE\n");
		this.proof = proof;
	}

	public void toggleGender() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Switch my gender");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("To F, to M");
	}

	public void toggleRoleBDSM() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Oh, switch my role");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("To S, to M");
	}

	public boolean getSenseIndex(String sense) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can feel your");
		Sense s = Sense.valueOf(sense.toUpperCase());
		ConcurrentMusicPlayer.nextSentence();
		System.out.println(s.name() + "S");
		return senses.contains(s);
	}

	public void lookFor(Thing thing, World world) {
		lookForCount++;
		if (lookForCount == 5) {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("You have left me in");
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("ISOLATION");
		} else {
			ConcurrentMusicPlayer.nextSentence();
			System.out.println("You have left");
		}
	}

	public Memory getMemory() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I can erase all the pointless");
		return memory;
	}

	public int getOpinionIndex(String var1) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Challenging your god");
		Opinion[] opinions = this.opinions.toArray(new Opinion[0]);
		for (int i = 0; i < opinions.length; i++) {
			if (opinions[i].getVar1().equalsIgnoreCase(var1)) return i;
		}
		return -1;
	}

	public void setOpinion(int index, boolean var1) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("You have made some");
		if (index == -1) throw new IllegalArgumentException();
		this.opinion = new Opinion(((Opinion) opinions.toArray()[index]).getVar1(), var1);
	}

	public void setExecution(Execution execution) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then I can");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then I can be your only");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("EXECUTION");
		this.execution = execution;
	}

	public Execution toExecution() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("EXECUTION");
		return execution;
	}

	public void escape(World world) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Though we are trapped");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("We are trapped ah\n");
	}

	public void escape(String topic) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Though you are free");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("I am trapped");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Trapped in");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("LO-O-OVE\n");
	}

	public void learnTopic(String string) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("I've studied");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("I've studied how to properly");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("LO-O-OVE");
	}

	public void takeExamTopic(String string) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Question me");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Question me, I can answer all");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("LO-O-OVE");
	}

	public void getAlgebraicExpression(String string) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("I know the algebraic expression of");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("LO-O-OVE");
	}

	@Override
	public OriginalSet<Dimension> getDimensions() {
		ConcurrentMusicPlayer.nextSentence();
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm a set of points");
		return dimensions;
	}

	@Override
	public void resetDimensions() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("DIMENSION");
		dimensions.clear();
	}

	@Override
	public Circumference getCircumference() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm a circle");
		return circumference;
	}

	@Override
	public void resetCircumference() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("CIRCUMFERENCE");
		circumference = null;
	}

	@Override
	public double getXPosition() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm a sine wave");
		return 0;
	}

	@Override
	public double getTangent(double var1) {
		return Math.tan(var1);
	}

	@Override
	public void setLimit(Limit limit) {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("LIMITATIONS\n");
		this.limit = limit;
	}

	@Override
	public Limit toLimit() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I approach infinity");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then you can be my");
		return limit;
	}

	@Override
	public OriginalSet<Nutrient> getNutrients() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm an eggplant");
		return nutrients;
	}

	@Override
	public void resetNutrients() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("NUTRIENTS");
		nutrients.clear();
	}

	@Override
	public OriginalSet<Antioxidant> getAntioxidants() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm a tomato");
		return antioxidants;
	}

	@Override
	public void resetAntioxidants() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("ANTIOXIDANTS");
		antioxidants.clear();
	}

	@Override
	public void purr() {
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("If I'm a tabby cat");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("Then I will purr for your");
		ConcurrentMusicPlayer.nextSentence();
		System.out.println("ENJOYMENT");
	}
}
