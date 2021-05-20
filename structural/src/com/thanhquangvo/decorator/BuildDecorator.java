package com.thanhquangvo.decorator;

public abstract class BuildDecorator implements House {

    private final House house;

    public BuildDecorator(House house) {
        this.house = house;
    }

    @Override
    public String build() {
        return house.build();
    }
}
