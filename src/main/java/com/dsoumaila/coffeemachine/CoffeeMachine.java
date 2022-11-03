package com.dsoumaila.coffeemachine;

import java.math.BigDecimal;

import static com.dsoumaila.coffeemachine.Coffee.*;
import static java.math.BigDecimal.ZERO;

public class CoffeeMachine {

    public static final BigDecimal COFFEE_PRICE = new BigDecimal("0.6");
    public static final BigDecimal TEA_PRICE = new BigDecimal("0.4");
    public static final BigDecimal CHOCOLATE_PRICE = new BigDecimal("0.5");

    public String display(Coffee coffee, int quantityOfSugar, BigDecimal price) {
        BigDecimal restOfMoney = ZERO;

        restOfMoney = getTheRestOfMoney(coffee, price, restOfMoney);

        if (restOfMoney.compareTo(ZERO) > 0) {
            return "M:Missing " + restOfMoney.setScale(1) + " €";
        }

        return coffee.getValue() + (quantityOfSugar == 0 ? "::" : ":" + quantityOfSugar + ":0");
    }

    private BigDecimal getTheRestOfMoney(Coffee coffee, BigDecimal price, BigDecimal restOfMoney) {
        if (isCoffeePriceMissing(coffee, price)) {
            restOfMoney = COFFEE_PRICE.subtract(price);
        }

        if (isTeaPriceMissing(coffee, price)) {
            restOfMoney = TEA_PRICE.subtract(price);
        }

        if (isChocolatePriceMissing(coffee, price)){
            restOfMoney = CHOCOLATE_PRICE.subtract(price);
        }

        return restOfMoney;
    }

    private boolean isChocolatePriceMissing(Coffee coffee, BigDecimal price) {
        return coffee.equals(CHOCOLATE) && CHOCOLATE_PRICE.compareTo(price) >= 0;
    }

    private boolean isTeaPriceMissing(Coffee coffee, BigDecimal price) {
        return coffee.equals(TEA) && TEA_PRICE.compareTo(price) >= 0;
    }

    private boolean isCoffeePriceMissing(Coffee coffee, BigDecimal price) {
        return coffee.equals(COFFEE) && COFFEE_PRICE.compareTo(price) >= 0;
    }
}
