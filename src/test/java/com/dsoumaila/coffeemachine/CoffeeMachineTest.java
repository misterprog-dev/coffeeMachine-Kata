package com.dsoumaila.coffeemachine;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.dsoumaila.coffeemachine.Coffee.TEA;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeeMachineTest {

    @Test
    public void should_display_type_of_drink() {
        // GIVEN
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // WHEN
        String message = coffeeMachine.display(TEA, 0, new BigDecimal("0.4"));

        // THEN
        assertThat(message).isEqualTo("T::");
    }

    @Test
    public void should_display_drink_with_sugar_and_stick() {
        // GIVEN
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // WHEN
        String message = coffeeMachine.display(TEA, 1, new BigDecimal("0.4"));

        // THEN
        assertThat(message).isEqualTo("T:1:0");
    }

    @Test
    public void should_display_drink_with_number_of_sugar_and_stick() {
        // GIVEN
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // WHEN
        String message = coffeeMachine.display(TEA, 3, new BigDecimal("0.4"));

        // THEN
        assertThat(message).isEqualTo("T:3:0");
    }

    @Test
    public void should_warn_user_for_missing_money() {
        // GIVEN
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // WHEN
        String message = coffeeMachine.display(TEA, 3, new BigDecimal("0.2"));

        // THEN
        assertThat(message).isEqualTo("M:Missing 0.2 €");
    }
}
