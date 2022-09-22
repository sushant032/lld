package com.compaloon.machine.inventory;

import lombok.Getter;

@Getter
public class Water implements IIngredient {

    double quantity;
    private IngredientEnum ingredient;

    public Water(double quantity) {
        this.quantity = quantity;
        this.ingredient = IngredientEnum.WATER;
    }

    @Override
    public void refill() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void take(double quantity) {
        this.quantity-=quantity;
    }
}
