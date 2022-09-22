package com.compaloon.machine.inventory;

public interface IIngredient {
    int remainingQuantity = 0;
    void refill();
    boolean isEmpty();
    void take(double quantity);
    double getQuantity();
    IngredientEnum getIngredient();
}
