package com.rxnqst.pvz.plants;

import com.rxnqst.pvz.GameEngine;
import com.rxnqst.pvz.GameEngine.SeedSlot;
import com.rxnqst.pvz.peas.Pea;
import com.rxnqst.pvz.utils.Rect;

import java.io.Serializable;

public abstract class Plant implements Serializable {
    public int hp;
    public Rect hitbox;
    public int line;
    public int column;
    public SeedSlot type;
    public boolean canShoot;
    public Pea ammo;
    public int reloadCooldown = 0;
    public int level;
    public Plant(int hp, int tileX, int tileY, SeedSlot texture_name, boolean canShoot) {
        this.hp = hp;
        this.level = 1;
        this.line = tileY;
        this.column = tileX;
        this.canShoot = canShoot;
        this.type = texture_name;
        GameEngine.selectedObject = null;
    }
    public void levelUP() {
        ++level;
    }
}