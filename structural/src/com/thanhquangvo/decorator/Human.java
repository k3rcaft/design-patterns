package com.thanhquangvo.decorator;

public class Human {

    public static void main(String[] args) {
        Human human = new Human();
        human.buildAHouse();
    }

    void buildAHouse() {
        BuildDecorator completelyHouse  = new Roof(new Wall(new BasicHouse()));
        System.out.println(completelyHouse.build());
    }
}
