import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
        private GreenfootImage robotimage1= new GreenfootImage("man01.png");
        private GreenfootImage robotimage2= new GreenfootImage("man02.png");
        private int Lives = 3;
        private int Score = 0;
        private int pizzaEaten = 0; 
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectWallCollision();
        detectBlockCollision();
        eatPizza();
        detectHome();
        robotMovement();
    }
    public void robotMovement()
        {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation( getX(), getY() -3);
            Animate();
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation( getX(), getY() +3);
            Animate();
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation( getX() -3, getY());
            Animate();
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation( getX() +3, getY());
            Animate();
        }
    }
    public void detectWallCollision()
    {
       if (isTouching(Wall.class))
       {
           setLocation(25,50);
           Greenfoot.playSound("hurt.wav");
           removeLife();
       }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Block.class))
        {
           setLocation(25,50);
           Greenfoot.playSound("hurt.wav");
           removeLife();
        }
    }
    public void detectHome()
    {
        if (isTouching(Home.class))
        {
            setLocation(25,50);
            if (pizzaEaten < 5)
            {
                Greenfoot.stop();
            }
        }
    }
    public void eatPizza()
    {
        Greenfoot.playSound("eat.wav");
        removeTouching(Pizza.class);
        if (isTouching(Pizza.class))
        {
            pizzaEaten=pizzaEaten + 1;
        }
    }
    public void Animate()
    {
        if (getImage()==robotimage1)
            {
                setImage(robotimage2);
            }
        else
            {
                setImage(robotimage1);
            }
    }
    public void removeLife()
    {
      Lives = Lives - 1;
      testEndGame();
    }
    public void testEndGame()
    {
        if (Lives < 0)
             Greenfoot.stop();
    }
}
