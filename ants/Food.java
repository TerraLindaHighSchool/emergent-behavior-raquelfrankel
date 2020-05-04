import greenfoot.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    private GreenfootImage Image;
    private int crumb = 100;
    private final int size = 30;
    public Food()
    {
     Image = new GreenfootImage(size, size);   
     updateImage();
     removeCrumb();
    }
    private void updateImage()
    {
     Random random = new Random();
     for(int i = 0; 1< crumb; i++)
     {
             int stDev = size / 6;
     int x = (int) (stDev * random.nextGaussian( ) + 3 * stDev);
     int y = (int) (stDev * random.nextGaussian( ) + 3 * stDev);
            
     // keep crumbs in Image
     if(x < 0) 
         x = 0;
     if(x >= size) 
         x = size - 1;
     if(y < 0) 
         y = 0;
     if(y >= size) 
         y = size - 1;
     
     Color color = new Color(165, 42, 42);  // pick the color you want by replacing r, g, b with values.
     Image.setColorAt(x, y, color);

     }
     setImage(Image);
    }
    public void removeCrumb()
    {
     crumb--;
     Image.clear();
     if (crumb == 0) 
        {
            getWorld().removeObject(this);
        }
     
    }
}   