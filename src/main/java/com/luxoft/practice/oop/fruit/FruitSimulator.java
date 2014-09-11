package com.luxoft.practice.oop.fruit;

import com.luxoft.practice.oop.basket.AppleBasket;
import com.luxoft.practice.oop.basket.Basket;

/**
 * Created by User on 11.09.2014.
 */
public class FruitSimulator {

    public static void main(String...args) {
        Basket basket = new Basket();
        Apple apple = new Apple();
        Orange orange = new Orange();

        basket.putFruit(apple);
        basket.putFruit(orange);

        basket.eatAllFruits();

        Basket appleBasket = new AppleBasket();
        appleBasket.putFruit(new Apple());
        appleBasket.putFruit(new Apple());
        appleBasket.putFruit(new Orange());

        Fruit fuit = basket.getOneFruit();
    }
}
