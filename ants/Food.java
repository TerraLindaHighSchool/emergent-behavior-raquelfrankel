import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       image();
       crumbs();
       size();
    } 
    private void image()
    {
     image = new GreenfootImage(80, 80);
    }
    private int crumbs()
    {
     int crumbs = 100;
     
    }
    final private int size()
    {
     int size = 30;
    }
    private void updateImage()
    {
      Object = new object(random)
      
    }
    private void for loop()
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
     
     Color color = new Color(r, g, b);  // pick the color you want by replacing r, g, b with values.
     image.setColorAt(x, y, color);
    }
    public void removeCrumb()
    {
    
    }
}
