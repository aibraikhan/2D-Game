package src.objects;

import src.main.Game;

public class Cannon extends GameObject{

    private int tileY;
    public Cannon(int x, int y, int objType) {
        super(x, y, objType);
        tileY = y / Game.TILES_SIZE;
        initHitbox(40, 26);
        hitbox.x -= (int) (4 * Game.SCALE);
        hitbox.y += (int) (6 * Game.SCALE);
    }

    public void update() {
        if (doAnimation)
            updateAniTick();
    }

    public int getTileY() {
        return tileY;
    }
}










