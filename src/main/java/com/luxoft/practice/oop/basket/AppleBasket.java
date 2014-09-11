package com.luxoft.practice.oop.basket;

import com.luxoft.practice.oop.fruit.Apple;
import com.luxoft.practice.oop.fruit.Fruit;

/**
 * Created by User on 11.09.2014.
 */
public class AppleBasket extends Basket {

    @Override
    public void putFruit(Fruit fruit) {
        if (fruit instanceof Apple) {
            super.putFruit(fruit);
        } else {
            System.out.println("I want only apples!");
        }
    }

    @Override
    public Apple getOneFruit() {
        Fruit fruit = super.getOneFruit();
        if (fruit == null) {
            return null;
        } else {
            return (Apple) fruit;
        }
    }
}
