package com.compaloon.machine.inventory;

import lombok.Getter;

@Getter
public class Milk implements IIngredient {
    double quantity;
    private IngredientEnum ingredient;

    public Milk(double quantity) {
        this.quantity = quantity;
        this.ingredient = IngredientEnum.MILK;
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
