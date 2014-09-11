package com.luxoft.practice.oop.basket;

import com.luxoft.practice.oop.fruit.Fruit;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.09.2014.
 */
public class Basket {

    private List<Fruit> fruits = new ArrayList<Fruit>();

    public void putFruit(Fruit fruit) {
        fruit.whoWeAre();

        fruits.add(fruit);
    }

    public void eatAllFruits() {
        for (Fruit fruit : fruits) {
            fruit.eat();
        }
    }

    public Fruit getOneFruit() {
        if (fruits.isEmpty()) {
            System.out.println("I have no fruits");
            return null;
        } else {
            return fruits.get(0);
        }
    }
}
