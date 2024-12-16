package extraLarge;

import java.util.HashSet;

public class World {
    private Boolean giveBestAwardExecuted = false;
    private WorldObjectList worldObjects = new WorldObjectList();
    private HashSet<Rule> rules = new HashSet<>();
    private HashSet<Relationship> relationships = new HashSet<>();
    private River river = null;
    private Boolean postAskPhase = null;

    public World() {
        WorldObject wo1 = new WorldObject();
        this.worldObjects.add(0,wo1);
    }

    public void setPostAskPhase() {
        postAskPhase = true;
    }

    public void giveBestAward(String attribute, Life life) {
        if(!giveBestAwardExecuted) {
            System.out.println("A representation of ugly?");
            giveBestAwardExecuted = true;
        } else {
            System.out.println();
            System.out.println();
        }
    }

    public WorldObjectList getWorldObjects() {
        return this.worldObjects;
    }

    public void sendMessage(String msg, Life recipientLife) {
        switch (msg) {
            case "Oh you dummy.":
                System.out.println("I'm not mine NAND I'm not yours");
                break;
            case "I love you.":
                if(recipientLife.isYou()) {
                    System.out.println("Like what we did to the rivers we killed off in our near future");
                } else if(recipientLife.isMe()) {
                    System.out.println("Ah");
                }
                break;
            case "Anything inconvenient, I shall erase for you.":
                System.out.println("It's a perfect plan");
                break;
            default:
                break;
        }
        recipientLife.setMessages(new Message(msg));
    }

    public Relationship getRelationship(Life me, Life you) {
        for (Relationship r : relationships) {
            if (r != null)
                return r;
        }
        return new Relationship(me, you);
    }

    public Vulnerability getVulnerabilities() {
        Vulnerability vulnerabilities = new Vulnerability();
        vulnerabilities.add(new Vulnerability("ZeroDays"));
        return vulnerabilities;
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
        if(rule.getRuleString() == "Oedipus complex is okay"){
            System.out.println("There is no crime in ideality");
        }
    }

    public void setRelationship(Life me, Life you, Integer sustain) {
        if(sustain==null)
            this.getRelationship(me, you).end();
        else
            this.getRelationship(me, you).setSustain(sustain);
    }

    public void execute(Life me) {
        if(postAskPhase == null)
            System.out.println("Do we need a real reality?");
    }

    public River getRiver() {
        if(river == null) {
            System.out.println("Don't let words die, let love run dry");
            river = new River(1);
        }
        return river;
    }

    public void mute(Life life, String[] tagsStrings) {
        if(life.isMe()) {
            System.out.println("And mumble some stupid stuff");
        } else if(life.isYou()) {
            System.out.println("Like");
        }
    }

    public HashSet<Life> getLifeTopOnePercent() {
        System.out.println("I saw it coming");
        HashSet<Life> lifeTopOnePercent = new HashSet<>();
        lifeTopOnePercent.add(new Life());
        return lifeTopOnePercent;
    }

    public void addPollution(String field, String type, Life polluter) {
        System.out.println("FORGOTTEN ECOLOGY");
    }

    public Ghost[] search(Life me, String type) {
        System.out.println("We are searching");
        Ghost[] retGhosts = new Ghost[1];
        return retGhosts;
    }
}