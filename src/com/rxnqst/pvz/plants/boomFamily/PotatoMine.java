package com.rxnqst.pvz.plants.boomFamily;

import com.rxnqst.pvz.GameObjectType;
import com.rxnqst.pvz.plants.Plant;
import com.rxnqst.pvz.utils.Rect;

import static com.rxnqst.pvz.GameEngine.pvzContainers;

public class PotatoMine extends Plant {
    public int armoringTime = 500;
    public static int RELOAD = pvzContainers.get(GameObjectType.PotatoMine).RELOAD_TIME;
    public Rect boomArea;
    public PotatoMine(int posX, int posY) {
        super(100, posX, posY, false);
        hitbox = new Rect(column * 150+45, line * 150+135 , 54, 46);
        boomArea = new Rect(hitbox.x - 60, hitbox.y - 50, hitbox.width + 120, hitbox.height+65);
        type = GameObjectType.PotatoMine;
    }
}
