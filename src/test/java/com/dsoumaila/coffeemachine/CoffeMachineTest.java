package com.dsoumaila.coffeemachine;

import org.junit.jupiter.api.Test;

import static com.dsoumaila.coffeemachine.TypeOfCoffee.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CoffeMachineTest {

    @Test
    public void should_display_type_of_drink() {
        // GIVEN
        CoffeMachine coffeMachine = new CoffeMachine();

        // WHEN
        String message = coffeMachine.display(TEA, 0);

        // THEN
        assertThat(message).isEqualTo("T::");
    }

    @Test
    public void should_display_drink_with_sugar_and_stick() {
        // GIVEN
        CoffeMachine coffeMachine = new CoffeMachine();

        // WHEN
        String message = coffeMachine.display(TEA, 1);

        // THEN
        assertThat(message).isEqualTo("T:1:0");
    }

    @Test
    public void should_display_drink_with_number_of_sugar_and_stick() {
        // GIVEN
        CoffeMachine coffeMachine = new CoffeMachine();

        // WHEN
        String message = coffeMachine.display(TEA, 3);

        // THEN
        assertThat(message).isEqualTo("T:3:0");
    }
}
