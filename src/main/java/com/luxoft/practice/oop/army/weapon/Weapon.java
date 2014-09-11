package com.luxoft.practice.oop.army.weapon;

/**
 * Created by User on 11.09.2014.
 */
public class Weapon {

    private int damage;
    private int range;

    public Weapon(int damage, int range) {
        this.damage = damage;
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
