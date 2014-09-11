package com.luxoft.practice.oop.army.weapon;

/**
 * Created by User on 11.09.2014.
 */
public class Sword extends Weapon {

    private static final int SWORD_DAMAGE = 10;
    private static final int RANGE = 1;

    public Sword() {
        super(SWORD_DAMAGE, RANGE);
    }
}