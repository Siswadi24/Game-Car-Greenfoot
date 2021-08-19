import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kuat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kuat extends Actor
{
    /**
     * Act - do whatever the Kuat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deathtimer = 0; 
    
    private GreenfootImage Yaris; 
    
    public Kuat()
    {
        Yaris = getImage(); 
    }

    public void act() 
    {
        deathtimer++;
        if (deathtimer > 40) {
            ((MyWorld) getWorld()).die();
            getWorld().removeObject(this);
        } else {
            setImage(Yaris);
        }
        }
}
