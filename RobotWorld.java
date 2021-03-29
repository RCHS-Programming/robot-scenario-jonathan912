import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author Jonathan Klayer 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Robot(), 25,50);
        
        addObject(new Block(), 400,175);
        
        addObject(new Wall(), 50, 175);
        addObject(new Wall(), 150, 175);
        addObject(new Wall(), 250, 175);
        addObject(new Wall(), 550, 175);
        addObject(new Wall(), 650, 175);
        addObject(new Wall(), 750, 175);
        
        addObject(new Home(), 767, 566);
        
        addObject(new Scorepanl(), 75, 555);
        
        addObject(new Pizza(),Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(101));
        addObject(new Pizza(),Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(101));
        
        addObject(new Pizza(), Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(351)+250);
        addObject(new Pizza(), Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(351)+250);
        addObject(new Pizza(), Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(351)+250);
        addObject(new Pizza(), Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(351)+250);
    }
}
