  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int timer = 3000;
    private int counter = 0;
    private int i = 0;
    public void act() {
        timer--;
        counter++;
        i = timer / 100; 
        if((counter % 100) == 0 ){
            showText(""+i, 50, 50);
        }   
        if (timer <= 0) {
            Greenfoot.stop(); // pause the execution of the program if 'timer' is less than or equal to 0
        }
    }
    public MyWorld()
    {    
        super(600, 400, 1); 
        addObject( new bekkamu(), 300, 200 );
        addObject( new aaa(), 300, 200 );
        for (int i = 0; i < 5; i++) {
            RandomMover randomMover = new RandomMover();
            // ランダムな位置に追加 (x座標: 0~599, y座標: 0~399)
            addObject(randomMover, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        int groundLevel = getHeight() - 40;  // 地面から少し上の高さを計算
    }
    
}
