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
        getImage().scale( 60, 75 );
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
            setRotation(0);
            move(3);
        }if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(-180);
            move(3);
        }if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(-90);
            move(3);
        }if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(3);
        }
    }
   }
