package com.dsoumaila.coffeemachine;

public enum Coffee {
    TEA("T"),
    COFFEE("C"),
    CHOCOLATE("H");

    private String value;

    Coffee(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
