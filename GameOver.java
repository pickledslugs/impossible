import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Over text image.
 * 
 * @author Stepan Lugovoy
 * @version 1a
 */
public class GameOver extends Actor{
    public void act(){
        ((Game) getWorld()).Reset();
    }
}