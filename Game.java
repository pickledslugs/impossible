import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game world.
 * 
 * @author Stepan Lugovoy 
 * @version 1a
 */
public class Game extends World
{
    static int Floor;
    static int Left=200;
    static int Speed;
    static boolean begin=true;
    static int counter;
    static int Gen;
    public Game(){
        super(1280,720,1,false);
        if (begin==true){
            GameStart start = new GameStart();
            addObject(start, getWidth()/2, getHeight()/2);
        }
        begin=false;
        Floor=544-32;
        Player player = new Player();
        addObject(player, Left, Floor);
        //cre();
        prepare();
    }
    public void act(){
        counter++;
        if(counter==80){
            cre();
            counter=0;
        }
    }
    private void cre1(){
        Spike spike1 = new Spike();
        addObject(spike1, getWidth()+96, Floor);
    }
    private void cre2(){
        cre1();
        Spike spike2 = new Spike();
        addObject(spike2, getWidth()+160, Floor);
    }
    private void cre3(){
        cre2();
        Spike spike3 = new Spike();
        addObject(spike3, getWidth()+224, Floor);
    }
    private void cre4(){
        Box Box1 = new Box();
        BoxTop Top1 = new BoxTop();
        addObject(Box1, getWidth()+32, Floor+1);
        addObject(Top1, getWidth()+32, Floor-31);
        counter++;
        cre3();
        Box Box2 = new Box();
        BoxTop Top2 = new BoxTop();
        addObject(Box2, getWidth()+288, Floor+1);
        addObject(Top2, getWidth()+288, Floor-31);
    }
    private void cre5(){
        Box Box1 = new Box();
        BoxTop Top1 = new BoxTop();
        addObject(Box1, getWidth()+32, Floor+1);
        addObject(Top1, getWidth()+32, Floor-31);
        cre3();
        Spike spike4 = new Spike();
        addObject(spike4, getWidth()+288, Floor);
    }
    public void cre(){ 
            Gen = Greenfoot.getRandomNumber(5);
            if(Gen==0){
                cre1();
            }
            else if(Gen==1){
                cre2();
            }
            else if(Gen==2){
                cre3();
            }
            else if(Gen==3){
                cre4();
            }
            else{
                cre5();
            }
    }
    public void Reset(){
        if (Greenfoot.isKeyDown("r")){
            Greenfoot.setWorld(new Game());
            Speed=-15;
        }
    }
    private void prepare(){
        
    }
}