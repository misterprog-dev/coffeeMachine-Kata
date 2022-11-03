package com.dsoumaila.coffeemachine;

import java.math.BigDecimal;

import static com.dsoumaila.coffeemachine.Drink.*;
import static java.math.BigDecimal.ZERO;

public class Pad {
    public static final BigDecimal COFFEE_PRICE = new BigDecimal("0.6");
    public static final BigDecimal TEA_PRICE = new BigDecimal("0.4");
    public static final BigDecimal CHOCOLATE_PRICE = new BigDecimal("0.5");

    private Drink drink;
    private int quantityOfSugar;
    private BigDecimal price;

    public Pad(Drink drink, int quantityOfSugar, BigDecimal price) {
        this.drink = drink;
        this.quantityOfSugar = quantityOfSugar;
        this.price = price;
    }

    public String getTypeOfDrink() {
        return  drink.getValue();
    }

    public BigDecimal getTheRestOfMoney() {
        if (isCoffeePriceMissing(drink, price)) {
            return COFFEE_PRICE.subtract(price);
        }

        if (isTeaPriceMissing(drink, price)) {
            return TEA_PRICE.subtract(price);
        }

        if (isChocolatePriceMissing(drink, price)){
            return CHOCOLATE_PRICE.subtract(price);
        }

        return ZERO;
    }

    private boolean isChocolatePriceMissing(Drink drink, BigDecimal price) {
        return drink.equals(CHOCOLATE) && CHOCOLATE_PRICE.compareTo(price) >= 0;
    }

    private boolean isTeaPriceMissing(Drink drink, BigDecimal price) {
        return drink.equals(TEA) && TEA_PRICE.compareTo(price) >= 0;
    }

    private boolean isCoffeePriceMissing(Drink drink, BigDecimal price) {
        return drink.equals(COFFEE) && COFFEE_PRICE.compareTo(price) >= 0;
    }

    public Drink getDrink() {
        return drink;
    }

    public int getQuantityOfSugar() {
        return quantityOfSugar;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
