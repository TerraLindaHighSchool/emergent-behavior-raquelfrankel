import greenfoot.*;

/**
 * An ant that collects food.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Ant extends Creature
   {private boolean carryingFood;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private final  int MAX_PH_AVAILABLE = 16;
    private int TIME_FOLLOWING_TRAIL;
    private int phAvailable;
    private int followTrialTimeRemaining;
     /**
       * Create an ant with a given home hill. The initial speed is zero (not moving).
       */
       public Ant(AntHill home)
      {
        setHomeHill(home);
        image1 =  getImage();
        image2 = new GreenfootImage("ant-with-food.gif");
        followTrialTimeRemaining = 0;
        phAvailable = MAX_PH_AVAILABLE;
        TIME_FOLLOWING_TRAIL = 30;
       }
    
        private boolean atHome()
      {
         if (getHomeHill() != null) {
            return (Math.abs(getX() - getHomeHill().getX()) < 4) && 
                   (Math.abs(getY() - getHomeHill().getY()) < 4);
           }
           else {
               return false;
       }
      }
    
      /**
      * Do what an ant's gotta do.
      */
      public void act()
      {
        status();

      }
      
      private void checkForFood()
      {
    
    
        Food food = (Food) getOneIntersectingObject(Food.class);
        if (food != null) 
        {
            food.removeCrumb();
            carryingFood = true;
            image1 = image2;
        }
    
    
      } 
    
      private void searchForFood()
      {
         if(followTrialTimeRemaining == 0)
          {
             (SmellsPh)
             {
              walkTowardspharamoneCenter();
             }
            else
             {
            randomWalk(); 
            followTrialTimeRemaining --;
            walkAwayFromHome();
          }
          checkForFood();
         }
        }
      private void status()
       { {
            if(carryingFood)
           {
            walkTowardsHome(); 
            handlePheromoneDrop();
                       if (atHome())
            {
             setImage(image1);
             carryingFood = false;
             getHomeHill( ).countFood();
            }
           }
            else
           {
             followTrialTimeRemaining -- ;
             searchForFood(); 
            }
         }
       }
    
       private void handlePheromoneDrop()
        {
              if (phAvailable == MAX_PH_AVAILABLE) 
           {
            getWorld().addObject(new Pharamone(), getX(), getY());
            phAvailable = 0;
           }
           else 
           {
            phAvailable++;
           }
         }
    
       private boolean pharamonesmell()
         { 
           Actor ph = getOneIntersectingObject(Pharamone.class);
           return (ph != null); 
         }
    
       private void walkTowardspharamoneCenter()
         {
             Actor ph = getOneIntersectingObject(Pharamone.class);
            if (ph != null)
            {
            headTowards(ph);
            walk();
            if (ph.getX() == getX() && ph.getY() == getY())
            {
                followTrialTimeRemaining = TIME_FOLLOWING_TRAIL;
            }
           
             }
          }
}


   