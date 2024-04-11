public class Player
{
    private String name;

    public Player()
    {
        name = "unknown";
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void presentation()
    {
        System.out.println("Hello! My name is " + getName());
    }
}
