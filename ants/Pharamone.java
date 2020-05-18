import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pharamone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pharamone extends Actor
{   private GreenfootImage image;
    final static int MAX_INTENSITY = 180;
    private int intensity;
    public Pharamone()
    {
      intensity = MAX_INTENSITY;
      updateImage();
    }
    
    /**
     * Act - do whatever the Pharamone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {intensity--;
        if(intensity <= 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
             if ((intensity % 6) == 0)  // prevents updating too often
             { 
                 updateImage();
             }
        }
    }
    private void updateImage()
    {
    int size = intensity / 3 + 5;
    GreenfootImage image = new GreenfootImage(size,size);
    int alpha = intensity / 3;
    image.setColor(new Color(255, 255, 255, alpha));
    image.fillOval(0, 0, size, size);
    image.setColor(Color.DARK_GRAY);
    image.fillRect(size / 2, size / 2, 2, 2);   // small dot in the middle
    setImage(image);
      
    }
}
