package com.dsoumaila.coffeemachine;

import java.math.BigDecimal;

public class CoffeMachine {
    public String display(TypeOfCoffee typeOfCoffee, int quantityOfSugar) {
        return typeOfCoffee.getValue() + (quantityOfSugar == 0 ? "::" : ":" + quantityOfSugar + ":0");
    }
}
