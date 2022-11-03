package com.dsoumaila.coffeemachine;

public enum Drink {
    TEA("T"),
    COFFEE("C"),
    CHOCOLATE("H");

    private String value;

    Drink(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
