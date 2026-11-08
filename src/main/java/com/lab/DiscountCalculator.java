package com.lab;

/** Computes an integer discount using valid percent values. */
public class DiscountCalculator {
  /** Applies a percentage discount to an amount. */
  public int afterDiscount(int amount, int percent) {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount must be non-negative");
    }
    if (percent < 0 || percent > 100) {
      throw new IllegalArgumentException("Percent must be 0 to 100");
    }
    return amount * (100 - percent) / 100;
  }
}
