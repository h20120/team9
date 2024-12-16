 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bekkamu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class bekkamu extends Actor
{
    /**
     * Act - do whatever the bekkamu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 55, 65 );
        // ワールドの端を超えないようにする
        if (getX() < 10) {
            setLocation(10, getY());
        }
        // Add your action code here.
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-1,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+1,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-1 );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
           setLocation( x,y+1 );
        }
}

}

    