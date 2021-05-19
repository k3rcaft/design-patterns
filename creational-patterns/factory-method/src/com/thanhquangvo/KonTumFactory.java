package com.thanhquangvo;

public class KonTumFactory extends CoffeeMakingFactory {
    @Override
    public Coffee makeCoffee() {
        return new Robusta();
    }
}
