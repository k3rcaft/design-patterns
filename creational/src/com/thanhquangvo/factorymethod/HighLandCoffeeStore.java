package com.thanhquangvo.factorymethod;

public class HighLandCoffeeStore {

    CoffeeMakingFactory factory;

    public static void main(String[] args) {
        HighLandCoffeeStore store = new HighLandCoffeeStore();
        store.makeACupOfCoffee();
    }

    void makeACupOfCoffee() {
        factory = new DaLatFactory();
        System.out.println("Taste of a cup coffee is " + factory.makeCoffee().taste());
    }
}
