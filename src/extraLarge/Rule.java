package extraLarge;

public class Rule {
    private String text = new String();
    public Rule(String ruleString, boolean idunno) {
        this.text = ruleString;
    }
    public String getRuleString() {
        return this.text;
    }
}
