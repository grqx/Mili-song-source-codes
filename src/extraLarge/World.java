package extraLarge;

import java.util.LinkedList;
// import java.util.List;

public class World{
    private Boolean giveBestAwardExecuted = false;
    private WorldObjectList worldObjects = new WorldObjectList();
    private OriginalSet<Rule> rules = new OriginalSet<>();
    private LinkedList<Relationship> relationships = new LinkedList<>();
    private River river = null;
    private Boolean postAskPhase = null;

    public World() {
        WorldObject wo1 = new WorldObject();
        this.worldObjects.add(0,wo1);
    }
    public void giveBestAward(String attribute, Life life) {
        if(!giveBestAwardExecuted){
            System.out.println("A representation of ugly?");
            giveBestAwardExecuted = true;
        } else System.out.println();
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
            if(r!=null)
                return r;
        }
        return new Relationship(me, you);
    }


    public Vulnerability getVulnerabilities() {
        Vulnerability Vulnerabilities = new Vulnerability();
        return Vulnerabilities;
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
            System.out.println("Don't let words-die, let love run dry");
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

    public OriginalSet<Life> getLifeTopOnePercent() {
        System.out.println("\"I saw it coming\"");
        OriginalSet<Life> lifeTopOnePercent = new OriginalSet<>();
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

    public void setPostAskPhase() {
        postAskPhase = true;
    }
}