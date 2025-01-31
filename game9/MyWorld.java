import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int timer = 2000; // ゲームタイマー（20秒のカウントダウン）
    private int counter = 0; // フレームカウント用
    private int i = 0; // タイマーの表示用
    private int spawnTimer = 0; // 生成間隔カウント用（1000フレームごとに生成）

    public void act() {
        // ゲームタイマーを減少
        timer--;
        counter++;
        i = timer / 100;  // タイマーを100で割って秒数を表示

        if((counter % 100) == 0) {
            showText(""+i, 50, 50);  // 画面にタイマー表示
        }

        // タイマーが0以下になったらゲームを停止
        if (timer <= 0) {
            showText("ゲームクリア！", getWidth() / 2, getHeight() / 2);  // 中央に「ゲームクリア！」を表示
            Greenfoot.stop();  // ゲームを停止
        }

        // 10秒（1000フレーム）ごとにRandomMoverを生成
        spawnTimer++;
        if (spawnTimer >= 100) {  // 1000フレームごとに生成
            spawnRandomMover();
            spawnTimer = 0;  // 生成後にカウントをリセット
        }
    }

    // RandomMoverをランダムな位置に生成するメソッド
    private void spawnRandomMover() {
        RandomMover randomMover = new RandomMover();
        // ランダムな位置に追加 (x座標: 0~599, y座標: 0~399)
        addObject(randomMover, Greenfoot.getRandomNumber(i * 19), Greenfoot.getRandomNumber(100));
    }

    public MyWorld()
    {    
        // 600x400サイズのワールドを作成
        super(600, 400, 1); 
        
        // 初期オブジェクトを配置
        addObject(new bekkamu(), 300, 200);
        addObject(new aaa(), 300, 200);

        // 初期のRandomMoverオブジェクトを配置
        for (int i = 0; i < 2; i++) {
            RandomMover randomMover = new RandomMover();
            // ランダムな位置に追加 (x座標: 0~599, y座標: 0~399)
            addObject(randomMover, Greenfoot.getRandomNumber(600), 5);
        }
        for (int i = 0; i < 1; i++) {
            RandomMover randomMover = new RandomMover();
            // ランダムな位置に追加 (x座標: 0~599, y座標: 0~399)
            addObject(randomMover, 580, 380);
        }
        for (int i = 0; i < 2; i++) {
            RandomMover randomMover = new RandomMover();
            // ランダムな位置に追加 (x座標: 0~599, y座標: 0~399)
            addObject(randomMover, 5, Greenfoot.getRandomNumber(400));
        }

        int groundLevel = getHeight() - 40;  // 地面の高さを計算
    }
}
