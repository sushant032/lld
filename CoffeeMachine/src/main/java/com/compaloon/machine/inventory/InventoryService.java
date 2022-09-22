package com.compaloon.machine.inventory;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class InventoryService {
    Map<IngredientEnum, IIngredient> ingredients;

    public InventoryService() {
        ingredients = new HashMap<>();
    }

    public void addIngredient(IIngredient ingredient) {
        ingredients.put(ingredient.getIngredient(), ingredient);
    }

    public void addIngredients(List<IIngredient> ingredients) {
        for(IIngredient ingredient: ingredients)
            this.ingredients.put(ingredient.getIngredient(), ingredient);
    }
}
