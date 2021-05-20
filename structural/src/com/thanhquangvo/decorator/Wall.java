package com.thanhquangvo.decorator;

public class Wall extends BuildDecorator {

    public Wall(House house) {
        super(house);
    }

    @Override
    public String build() {
        return super.build() +  "yellow wall";
    }
}
