import greenfoot.*;  // Greenfootのクラスをインポート

public class RandomMover extends Actor
{
    private int speed; // スピード
    private int direction; // 方向
    

    public RandomMover()
    {
        // ランダムなスピードを設定（例えば、1～5の間）
        speed = Greenfoot.getRandomNumber(3) + 1;
        
        // ランダムな方向を設定（0～360度の間）
        direction = Greenfoot.getRandomNumber(360);
    }

    public void act()
    {
        // ランダムな方向に移動する
        move();
        getImage().scale( 80, 80 );
    }

    // 方向に従って動かす
    public void move()
    {
        // 現在の方向に基づいて進む
        setRotation(direction);
        move(speed);

        // 壁に当たったら反射する
        if (isAtEdge())
        {
            // 反射する方向を計算
            direction = (direction + 180) % 360;  // 現在の方向に180度足して反対方向に向かせる
        }

        // ランダムに方向を変更
        if (Greenfoot.getRandomNumber(100) < 5)  // 5%の確率で方向を変える
        {
            direction = Greenfoot.getRandomNumber(360);  // 新しいランダムな方向を設定
        }
    }
}
