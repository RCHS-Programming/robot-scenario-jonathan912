import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
    }
        public void robotMovement()
        {
                    if (Greenfoot.isKeyDown("w"))
        {
            setLocation( getX(), getY() -3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation( getX(), getY() +3);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation( getX() -3, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation( getX() +3, getY());
        }
        }
    }    

