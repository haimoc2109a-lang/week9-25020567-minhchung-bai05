package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {
  private final DiscountCalculator calculator = new DiscountCalculator();

  @Test
  void discountsValidAmount() {
    assertEquals(80, calculator.afterDiscount(100, 20));
    assertEquals(100, calculator.afterDiscount(100, 0));
    assertEquals(0, calculator.afterDiscount(100, 100));
  }

  @Test
  void rejectsInvalidAmount() {
    assertThrows(IllegalArgumentException.class,
        () -> calculator.afterDiscount(-1, 10));
  }

  @Test
  void rejectsInvalidPercent() {
    assertThrows(IllegalArgumentException.class,
        () -> calculator.afterDiscount(100, -1));
    assertThrows(IllegalArgumentException.class,
        () -> calculator.afterDiscount(100, 101));
  }
}
