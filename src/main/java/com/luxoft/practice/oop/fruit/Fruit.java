package com.luxoft.practice.oop.fruit;

public class Fruit {

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private int weight;

    public void eat() {
        System.out.println("I'm eating abstract fruit");
    }

    public void whoWeAre() {
        System.out.println("I'm abstract Fruit");
    }

    private void testPrivate() {
        System.out.println("Testing private");
    }

    protected void testProtected() {
        System.out.println("Testing protected");
    }
}
