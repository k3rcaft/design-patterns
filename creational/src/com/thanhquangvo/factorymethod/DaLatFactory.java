package com.thanhquangvo.factorymethod;

public class DaLatFactory extends CoffeeMakingFactory{
    @Override
    public Coffee makeCoffee() {
        return new Arabica();
    }
}
