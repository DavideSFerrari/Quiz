package Player;

public class Player
{
    private String name;
    private String decision;

    public Player()
    {
        name = "unknown";
        decision = "no";
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDecision()
    {
        return decision;
    }
    public void setDecision(String decision)
    {
        this.decision = decision;
    }
    
    public void presentation()
    {
        System.out.println("Hello! My name is " + getName() + ", and I say " + getDecision());
    }

}
