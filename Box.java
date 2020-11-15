import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A box that you can step on but can't bump in.
 * 
 * @author Stepan Lugovoy
 * @version 1a
 */
public class Box extends Obstacle
{
    public void act() 
    {
        move(Game.Speed);
    }
}