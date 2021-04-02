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
        addObject(new Block(), 250,425);
        addObject(new Block(), 550,325);
        
        addObject(new Wall(), 50, 175);
        addObject(new Wall(), 150, 175);
        addObject(new Wall(), 250, 175);
        addObject(new Wall(), 550, 175);
        addObject(new Wall(), 650, 175);
        addObject(new Wall(), 750, 175);
        addObject(new Wall(), 250, 275);
        addObject(new Wall(), 550, 475);
        addObject(new Wall(), 550, 575);

        addObject(new Wall(), 250, 575);
        
        addObject(new Home(), 767, 566);
        
        addObject(new Scorepanl(), 75, 555);
        
        addObject(new Pizza(),Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(101));
        addObject(new Pizza(),Greenfoot.getRandomNumber(801), Greenfoot.getRandomNumber(101));
        
        addObject(new Pizza(), 30,265);
        addObject(new Pizza(), 160, 265);
        addObject(new Pizza(), 700, 265);
        addObject(new Pizza(), 750, 465);
        
        showText("Lives: 3", 70, 540);
        showText("Pizzas: 0", 70, 560);
        showText("Score: 0", 70, 580);
        
    }
}
