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
<<<<<<< HEAD
        getImage().scale( 55, 65 );
=======
       
        // ワールドの端を超えないようにする
        if (getX() < 10) {
            setLocation(10, getY());
        }
        if (getX() > getWorld().getWidth() - 10) {
            setLocation(getWorld().getWidth() - 10, getY());
        }
>>>>>>> cdad9f8896307d47a061150063ba07bd8dc627b6
        // Add your action code here.
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(2);
    }if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(-180);
        move(2);
    }if( Greenfoot.isKeyDown( "up" ) ){
<<<<<<< HEAD
        setRotation(90);
        move(2);
    }if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(-90);
        move(2);
=======
        setRotation(-90);
        move(1);
    }if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
>>>>>>> cdad9f8896307d47a061150063ba07bd8dc627b6
    }
       
}

}

    