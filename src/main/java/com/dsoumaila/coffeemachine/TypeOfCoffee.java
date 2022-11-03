package com.dsoumaila.coffeemachine;

public enum TypeOfCoffee {
    TEA("T"),
    COFFEE("C"),
    CHOCOLATE("H");

    private String value;

    TypeOfCoffee(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
