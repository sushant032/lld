package com.compaloon.machine.inventory;

import lombok.Getter;

@Getter
public class Sugar implements IIngredient {
    double quantity;
    private IngredientEnum ingredient;

    public Sugar(double quantity) {
        this.quantity = quantity;
        this.ingredient = IngredientEnum.SUGAR;
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
