package com.compaloon.machine.beverages;

import com.compaloon.machine.inventory.IngredientEnum;
import lombok.Getter;

@Getter
public class IngredientQuantity {
    private IngredientEnum ingredient;
    private double quantity;

    public IngredientQuantity(IngredientEnum ingredient, double quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }
}
