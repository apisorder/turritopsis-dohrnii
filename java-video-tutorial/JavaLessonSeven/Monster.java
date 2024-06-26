
// Programmer:     Cheng, Jeff
// Last Modified:  06-21-2024 07:05PM
// Problem:        Java Tutorial 7 (Monster Class)

public class Monster
{
    public final String TOMBSTONE = "Here Lies a Dead Monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    public int getAttack()
    {
        return attack;
    }
    public int getHealth()
    {
        return health;
    }
    public int getMovement()
    {
        return movement;
    }
    
    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth)
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }
    public Monster(int newHealth)
    {
        health = newHealth;
    }

    public Monster(int newHealth, int attack, int newMovement)
    {
        this(newHealth);
        this.attack = attack;
        movement = newMovement;
    }   

    //  Default Constructor
    //  also provided by the Java interpreter if no constructors have been defined
    //  overloading the constructor
    public Monster()
    {

    }

    //  this is the wrong way!
    //  it allows access to the private field!!!! (since we are inside the class)
    // public static void main(String[] args)
    // {
    //     Monster Frank = new Monster();
    //     System.out.println(Frank.attack);
    // }
}

