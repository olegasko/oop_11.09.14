package com.luxoft.practice.oop.army.warriors;

import com.luxoft.practice.oop.army.armor.Armor;
import com.luxoft.practice.oop.army.armor.Breastplate;
import com.luxoft.practice.oop.army.armor.Helmet;
import com.luxoft.practice.oop.army.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.09.2014.
 */
public class Warrior {

    private int stamina;
    private int strength;
    private int dexerity;

    private Weapon weapon;
    private List<Armor> armors = new ArrayList<Armor>();

    public void wearArmor(Armor armor) {
        Armor helmet = null;
        Armor breastplate = null;
        for (Armor wornArmor : armors) {
            if (wornArmor instanceof Helmet) {
                helmet = wornArmor;
            } else {
                breastplate = wornArmor;
            }
        }
        if (armor instanceof Helmet) {
            if (helmet != null) {
                armors.remove(helmet);
            }
            armors.add(armor);
        }
        if (armor instanceof Breastplate) {
            if (breastplate != null) {
                armors.remove(breastplate);
            }
            armors.add(armor);
        }
    }

    public int hit() {
        return getStrength() + weapon.getDamage();
    }

    public void move() {

    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        strength = strength;
    }

    public int getDexerity() {
        return dexerity;
    }

    public void setDexerity(int dexerity) {
        dexerity = dexerity;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
