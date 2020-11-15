import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Playable object.
 * 
 * @author Stepan Lugovoy
 * @version 1a
 */
public class Player extends Actor{
    int dy=0;
    int g=4;
    boolean spaceKeyDown=false;
    boolean over=false;
    public void act(){
        ((Game) getWorld()).Reset();
        checkKeyPress();
        checkCollision();
        setLocation(Game.Left,getY()+dy);
        if(getY()>=Game.Floor){
            setLocation(Game.Left,Game.Floor);
        }        
        if(isTouching(BoxTop.class)){
            Game.Floor=Game.Floor-64;
            setLocation(Game.Left,Game.Floor);
            dy=0;
            checkKeyPress();
        }
        Game.Floor=544-32;
        dy=dy+g;
        if(over==true){
            Greenfoot.playSound("GameOver.wav");
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover,getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().removeObject(this);
            Game.Speed = 0;
        }
    }
    private void checkKeyPress() {
        if(Greenfoot.isKeyDown("space")){
            if(getY()>=Game.Floor){
                dy=-42;
            }
        }
    }
    private void checkCollision() {
        if(isTouching(Obstacle.class)){
            over=true;
        }
    }
}