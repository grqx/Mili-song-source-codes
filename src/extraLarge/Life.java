package extraLarge;

import java.util.HashSet;
import java.util.LinkedList;

class FinanceProperty {
    public Integer value = 0;
    public FinanceProperty(int value) {
        this.value = value;
    }
}

public class Life {
    public HashSet<Thought> thoughts = new HashSet<>();
    private Memories memories = new Memories();
    private LinkedList<FinanceProperty> financeProperties = new LinkedList<>();
    private Boolean bMe = null;
    private Ghost family = null;
    private Ghost[] parents = null;
    private Boolean calledForBoolean = null;
    private String[] vocabStrings = null;
    private Boolean shutUp = false;
    private Message lastMsg = null;

    public void addPhysicalAttribute(String attribute) {
        return ;
    }

    public Life getFetishes() {
        return this;
    }

    public Integer searchByType(String str1, String str2) {
        return 0;
    }

    public void addToMemory(Life me) {
        this.memories.add(new Memory(0.5, me));
        return ;
    }

    public void setNicknameFor(Life me, String nicknameString) {
        System.out.println("CALL ME " + nicknameString.toUpperCase());
        if(nicknameString == "mommy")
            System.out.println("JUST LIKE YOUR FANTASY");
        return ;
    }

    public Life getMommy(Life me) {

        return new Life();
    }

    public Message codeMessage(String msg, String codeTypeString) {
        this.bMe = true;
        Message rawMessage = new Message(msg);
        System.out.println("MUX>>DEMUX");
        if(codeTypeString == "mux")
            rawMessage.SwitchMuxed();
        return rawMessage;
    }

    public Message decodeMessage(Message codedMessage, String codeTypeString) throws InsufficientIntelligenceQuotientException {
        this.bMe = false;
        if(codeTypeString == "mux")
            return codedMessage.Demux();
        else return codedMessage;
    }
    
    public void announce(String announceString) {
        System.out.println(announceString);
        System.out.println();
        System.out.println();
    }

    public HashSet<Thought> getThoughts() {
        this.thoughts.add(new Thought(new String()));
        return this.thoughts;
    }

    public void sayTo(HashSet<Thought> thoughts, Life recipientLife) {
        System.out.println("This could end right here if you don't let it out");
        new World().sendMessage(thoughts.toString(), recipientLife);
    }

    public void clearThoughts() throws TooMuchOfAPussyException{
        System.out.println("Let it out");
        this.thoughts.clear();
        throw new TooMuchOfAPussyException();
    }

    public Memories getMemories(Life me) {
        System.out.println("Give up or give me your all");
        return this.memories;
    }

    public void transferThoughts(Life me) {
        System.out.println("Tell me now");
        me.thoughts = this.thoughts;
    }

    public void transferAttributes(Life me) {
        System.out.println("Tell me now");
        me.addPhysicalAttribute(this.memories.toString());
    }

    public Boolean isMe() {
        return this.bMe;
    }

    public Boolean isYou() {
        Boolean ret = null;
        try {
            ret = !this.bMe;
            return ret;
        } catch(java.lang.NullPointerException e) {
            return null;
        }
    }

    public void sayTo(String msgString, Life recipientLife) {
        new World().sendMessage(msgString, recipientLife);
    }

    public void fight(Life fightable) {
        if(this.isMe()) {
            System.out.println("Pretend it's not happening");
        } else if(this.isYou()) {
            System.out.println("Us losers do nothing so winners keep winning\n");
        }
    }

    public void command(Life recipientLife,String cmdString) {
        switch (cmdString) {
            case "sit":
                System.out.println("Sit");
                break;
            case "fetch":
                System.out.println("Fetch your leash");
                break;
            case "strip":
                System.out.println("Show me");
                break;
            case "exhabit":
                System.out.println("Your belly");
                break;
            case "stay":
                System.out.println("Stay");
                break;
            case "eat":
                System.out.println("Okay, eat");
                break;
            case "listen":
                System.out.println("Hear me out");
                break;
            case "be quite":  // typo in the official video
                if(!shutUp) {
                    System.out.println("If you'd just");
                    shutUp = true;
                } else
                    shutUp = null;
                System.out.println("SHUT UP");
                break;
            default:
                break;
        }
    }

    public LinkedList<FinanceProperty> getFinanceProperties() {
        return this.financeProperties;
    }

    public void addFinanceProperties(LinkedList<FinanceProperty> financeProperties) {
        for (FinanceProperty financeProperty : financeProperties) {
            this.financeProperties.add(financeProperty);
        }
    }
    
    public void resetFinanceProperties() {
        this.financeProperties = new LinkedList<>();
    }

    public void pay(Life recipientLife, LinkedList<FinanceProperty> financeProperties, String purpose){
        System.out.println("DICTATED ECONOMY");
        recipientLife.addFinanceProperties(financeProperties);
        this.resetFinanceProperties();
    }

    public void love(Life loverecipient) {
        System.out.println("HUMAN PSYCHOLOGY");
    }

    public void addFamily(Ghost ghost) {
        this.family = ghost;
        System.out.println("Following our human instincts");
    }

    public Boolean isHappy() {
        System.out.println("Looking for ghosts of the non-existing kind");
        return false;
    }

    public void removeFamily(Ghost g) {
        System.out.println("Who make us whole from the very beginning");
        if(family == g)
            g = null;
    }

    public Ghost[] getDreamParents() {
        System.out.println("We keep chasing");
        Ghost[] dreamParentsGhosts = {new Ghost(), null};
        return dreamParentsGhosts;
    }

    public void setParents(Ghost[] parents) {
        System.out.println("Dreaming about the perfect being");
        this.parents = parents;
    }

    public void throwTantrum() {
        System.out.println("Dreaming about the perfect being");
        System.out.println("Perfect parents who are non-existing");
        try {
            throw new Tantrum();
        } catch (Tantrum e) {
            System.out.println("Our bodies grew, our minds stayed the same");
            System.out.println();
            System.out.println();
        }
    }

    public void ask(Life life, String questionString) {
        if(this.isMe()) {
            System.out.println("Now, darling, where do we go from here?");
        } else if(this.isYou()) {
            System.out.println("Hey, honey, where do we go from here?");
        }
    }

    public void callFor(Life you) {
        if(calledForBoolean == null) {
            System.out.print("Darling, ");
            calledForBoolean = false;
        } else {
            calledForBoolean = true;
            System.out.println("darling");
            this.calledForBoolean = null;
        }
    }

    public void ask(World world, String askWorldString) {
        System.out.println(askWorldString + '\n');
        world.setPostAskPhase();
    }

    public void setVocabulary(String[] vocabularyStrings) {
        System.out.println("WHERE'S YOUR \"YES SIR\" & \"PLEASE\"?");
        System.out.println("That's the only vocabulary you need");
        this.vocabStrings = vocabularyStrings;
    }

    public void disorient(Life me) {
        System.out.println("MUX>>>DEMUX");
        System.out.println("Can't you understand me?");
        System.out.println("You turn my screen #0000ff");
        System.out.println();
        System.out.println();
    }

    public LinkedList<War> getOngoingFights() {
        System.out.println("We could end right here if you'd just let us fall");
        LinkedList<War> ongoingFightsWars = new LinkedList<War>();
        ongoingFightsWars.add(new War(this, "Just cruel war."));
        return ongoingFightsWars;
    }

    public void setMemory(String emotionString, Integer value) {
        if(this.isYou() && value == null){
            if(emotionString == "sad") {
                System.out.print("No tears, ");
            } else if(emotionString == "regretful") {
                System.out.println("no regrets");
            }
        }
    }

    public void setMemory(Life memoryLife, Integer value) {
        System.out.println("It's all just sunk cost, I know");
        System.out.println("But I'm not ready to stop");
    }



    public void listenTelepathically(Life me, World world) throws NotAMindReaderException {
        System.out.println("Then maybe you'll see what I've endured now");
        if(me instanceof Life && world instanceof World)
            throw new NotAMindReaderException();
    }





    public void ignoreCommands() {
        System.out.println("LILULILALULALULA");
    }

    public void setMessages(Message msg) {
        this.lastMsg = msg;
    }

    public void manipulate(Life manupulatedLife, String approach) {

    }


    public Memory getMemory(Life you, String emotion) {
        return new Memory(0, you);
    }
    public Life getMemory(Life life) {
        if (life.isYou())
            System.out.println("I don't want to stop");
        return life;
    }
    
    public void praise(Life recipientLife, String contentString) {
        System.out.println("g 0 0 d    b o i");
    }

    public void gift(Life recipientLife, String giftString) {
        System.out.println("Here's a treat");
    }

    public void consumeLast() {
        System.out.println("HUNGRY FOR ENERGY");
    }
}