package goddrinksjava;

import java.util.HashSet;
import java.util.Set;

/** Created by syuchan on 2016/10/17. */
public class World {
  private static Set<Thing> things = new HashSet<>();

  public World(int var1) {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("OBJECT CREATION");
  }

  public void addThing(Thing thing) {
    if (thing.getName().equals("Me")) {
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.print("Fill in my data");
    } else {
      System.out.println(" parameters");
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.println("INITIALIZATION");
    }
    things.add(thing);
  }

  public void startSimulation() {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("Set up our new world");
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("And let's begin the");
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("SIMULATION\n");
  }

  public void timeTravelForTwo(String kinen, int year, Thing... thing) {
    if (kinen.equals("AD")) {
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.println("Oh, we can travel");
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.print("To A.D. ");
    } else {
      System.out.println("to B.C.");
    }
  }

  public void unite(Thing... things) {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("And we can unite");
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("So deeply, so deeply\n");
  }

  public void lockThing(Thing thing) {
    if (thing.getName().equals("Me")) {
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.println("Though we are trapped");
    } else {
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.println("In this strange, strange");
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.println("SIMULATION\n");
    }
  }

  public Thing getGod() {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("If I'm the only god");
    for (Thing t : things) if (t.getName() == "Me") return t;
    return null;
  }

  public void procreate(Thing... things) {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("And then do whatever");
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("From AM to PM");
  }

  public void makeHigh(Thing thing) {
    if (thing.getName().equals("Me")) {
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.println("So we can enter");
      Thing.concurrentMusicPlayer.nextSentence();
      System.out.print("The trance, ");
    } else {
      System.out.println("the trance\n");
    }
  }

  public void unlock(Thing thing) {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("Though you have left\n");
  }

  public void removeThing(Thing thing) {
    things.remove(thing);
  }

  public int getThingIndex(Thing thing) {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("If I can have you back");
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("I will run the");
    return 0;
  }

  public void announce(String... args) {
    if (args[0].equals("God is always true.")) {
      args[0] = "ILLEGAL ARGUMENTS\n";
    } else {
      switch (args[0]) {
        case "1":
          args[0] = "EIN";
          break;
        case "2":
          args[0] = "DOS";
          break;
        case "3":
          args[0] = "TROIS";
          break;
        case "4":
          args[0] = "NE";
          break;
        case "5":
          args[0] = "FEM";
          break;
        case "6":
          args[0] = "LIU";
          break;
      }
    }
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println(args[0]);
  }

  public void runExecution() {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("EXECUTION");
  }

  public boolean isExecutableBy(Thing thing) {
    System.out.println();
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("If I can");
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("If I can give them all the");
    return things.contains(thing);
  }

  public void execute(Thing thing) {
    Thing.concurrentMusicPlayer.nextSentence();
    System.out.println("EXECUTION");
  }
}
