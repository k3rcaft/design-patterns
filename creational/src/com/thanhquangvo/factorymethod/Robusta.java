package com.thanhquangvo.factorymethod;

public class Robusta implements Coffee {

    @Override
    public String taste() {
        return "bitter";
    }
}
