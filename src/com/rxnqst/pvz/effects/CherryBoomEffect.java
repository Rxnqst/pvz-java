package com.rxnqst.pvz.effects;

import com.rxnqst.pvz.AnimationManager;

public class CherryBoomEffect extends Effect {
    public CherryBoomEffect(int posX, int posY) {
        super(posX-75, posY-75, 200, 132, 8,
                AnimationManager.getTexture(AnimationManager.AtlasName.CHERRY_BOOM_EFFECT));
    }

    @Override
    public void after() {

    }
}
