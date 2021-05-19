package com.thanhquangvo;

public class DaLatFactory extends CoffeeMakingFactory{
    @Override
    public Coffee makeCoffee() {
        return new Arabica();
    }
}
