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
    public bekkamu() {
    GreenfootImage image = getImage();         // 現在の画像を取得
    image.scale(image.getWidth() / 4, image.getHeight() / 4); // 幅と高さを半分に縮小
    setImage(image);                          // 縮小した画像をセット
}

    public void act() 
    {
          // 左右キーで移動
        if (Greenfoot.isKeyDown("left")) {
            move(-5);  // 左に5ピクセル移動
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);   // 右に5ピクセル移動
        }
        
        // ワールドの端を超えないようにする
        if (getX() < 10) {
            setLocation(10, getY());
        }
        if (getX() > getWorld().getWidth() - 10) {
            setLocation(getWorld().getWidth() - 10, getY());
        }
    }    
}
