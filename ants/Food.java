import greenfoot.*;// (World, Actor, Greenfootimage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    private GreenfootImage image;
    private int crumb = 100;
    private final int size = 30;
    public Food()
    {
       image = new GreenfootImage(size, size);   
       updateimage();
       removeCrumb();
    }
    
    private void updateimage()
     {
       Random random = new Random();
        for(int i = 0; i< crumb; i++)
         {
             int stDev = size / 6;
        int x = (int) (stDev * random.nextGaussian( ) + 3 * stDev);
        int y = (int) (stDev * random.nextGaussian( ) + 3 * stDev);
            
        // keep crumbs in image
        if(x < 0) 
         x = 0;
        if(x >= size) 
         x = size - 1;
        if(y < 0) 
         y = 0;
        if(y >= size) 
         y = size - 1;
     
       Color color = new Color(165, 42, 42);  // pick the color you want by replacing r, g, b with values.
       image.setColorAt(x, y, color);

      }
      setImage(image);
     }
   
    public void removeCrumb()
    {
     crumb--;
     image.clear();
     if (crumb == 0) 
        {
            getWorld().removeObject(this);
        }
     updateimage();
    }
}   