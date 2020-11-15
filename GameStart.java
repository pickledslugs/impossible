import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start text image.
 * 
 * @author Stepan Lugovoy
 * @version 1a
 */
public class GameStart extends Actor{
    public void act(){
        Game.Speed=0;
        if (Greenfoot.isKeyDown("space")){
            Game.Speed=-15;
            getWorld().removeObject(this);
        }
    }
}