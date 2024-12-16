package extraLarge;

import java.util.HashSet;

import music_player.ConcurrentMusicPlayer;

public class World {
    private static ConcurrentMusicPlayer concurrentMusicPlayer = new ConcurrentMusicPlayer(new MusicPlayerCfg());
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
            ConcurrentMusicPlayer.nextSentence();
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
            case "I love you.":
                if(recipientLife.isYou()) {
                    ConcurrentMusicPlayer.nextSentence();
                    System.out.println("Like what we did to the rivers we killed off in our near future");
                } else if(recipientLife.isMe()) {
                    ConcurrentMusicPlayer.nextSentence();
                    System.out.println("Ah");
                }
                break;
            case "Anything inconvenient, I shall erase for you.":
                ConcurrentMusicPlayer.nextSentence();
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
        if(rule.getRuleString() == "Oedipus complex is okay") {
            ConcurrentMusicPlayer.nextSentence();
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
        if(postAskPhase == null) {
            ConcurrentMusicPlayer.nextSentence();
            System.out.println("Do we need a real reality?");
        }
    }

    public River getRiver() {
        if(river == null) {
            ConcurrentMusicPlayer.nextSentence();
            System.out.println("Don't let words die, let love run dry");
            river = new River(1);
        }
        return river;
    }

    public void mute(Life life, String[] tagsStrings) {
        if(life.isMe()) {
            ConcurrentMusicPlayer.nextSentence();
            System.out.println("And mumble some stupid stuff");
        } else {
            ConcurrentMusicPlayer.nextSentence();
            System.out.println("Like");
            ConcurrentMusicPlayer.nextSentence();
            System.out.println("I saw it coming");
        }
    }

    public HashSet<Life> getLifeTopOnePercent() {
        HashSet<Life> lifeTopOnePercent = new HashSet<>();
        lifeTopOnePercent.add(new Life());
        return lifeTopOnePercent;
    }

    public void addPollution(String field, String type, Life polluter) {
        ConcurrentMusicPlayer.nextSentence();
        System.out.println("FORGOTTEN ECOLOGY");
    }

    public Ghost[] search(Life me, String type) {
        ConcurrentMusicPlayer.nextSentence();
        System.out.println("We are searching");
        ConcurrentMusicPlayer.nextSentence();
        System.out.println("Following our human instincts");
        Ghost[] retGhosts = new Ghost[1];
        return retGhosts;
    }
}