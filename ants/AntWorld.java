import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,490,272);
        Food food = new Food();
        addObject(food,505,436);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,314,217);
        AntHill antHill3 = new AntHill();
        addObject(antHill3,158,562);
        Food food2 = new Food();
        addObject(food2,93,231);
        Food food3 = new Food();
        addObject(food3,371,155);
        Food food4 = new Food();
        addObject(food4,304,386);
    }
    
    public void act()
    {
     if(getObjects(Food.class) || (getObjects(Pharamone.class) == 0));
     {
      endGame = true;
     }
    }
}