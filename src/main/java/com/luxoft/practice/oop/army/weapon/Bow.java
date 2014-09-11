package com.luxoft.practice.oop.army.weapon;

/**
 * Created by User on 11.09.2014.
 */
public class Bow extends Weapon {

    private static final int SWORD_DAMAGE = 20;
    private static final int RANGE = 10;

    public Bow() {
        this(SWORD_DAMAGE);
    }

    public Bow(int damage) {
        super(damage, RANGE);
    }
}