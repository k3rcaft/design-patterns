package com.thanhquangvo.factorymethod;

public class KonTumFactory extends CoffeeMakingFactory {
    @Override
    public Coffee makeCoffee() {
        return new Robusta();
    }
}
