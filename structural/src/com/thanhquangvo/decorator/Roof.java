package com.thanhquangvo.decorator;

public class Roof extends BuildDecorator {

    public Roof(House clothes) {
        super(clothes);
    }

    @Override
    public String build() {
        return super.build() + " red roof";
    }
}
