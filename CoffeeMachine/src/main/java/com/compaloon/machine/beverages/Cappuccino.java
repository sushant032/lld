package com.compaloon.machine.beverages;

import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.inventory.IIngredient;
import com.compaloon.machine.inventory.IngredientEnum;
import com.compaloon.machine.inventory.InventoryService;
import com.compaloon.machine.inventory.Milk;

import java.util.Arrays;
import java.util.List;

public class Cappuccino implements IBeverage {
    double price;
    BeverageEnum beverage;
    List<IngredientQuantity> requiredIngredients;
    InventoryService inventoryService;

    public Cappuccino(double price, InventoryService inventoryService) {
        this.price = price;
        this.beverage = BeverageEnum.CAPPUCCINO;
        this.requiredIngredients = Arrays.asList(new IngredientQuantity(IngredientEnum.MILK, .7), new IngredientQuantity(IngredientEnum.SUGAR, .1), new IngredientQuantity(IngredientEnum.WATER, .2));
        this.inventoryService = inventoryService;
    }

    @Override
    public void prepare(Size size) {
        System.out.printf("Preparing %s \n", beverage.name());
        for (IngredientQuantity ingredientQuantity: requiredIngredients) {
            IIngredient ingredient = inventoryService.getIngredients().get(ingredientQuantity.getIngredient());
            double requiredQuantity = size.getQuantity() * ingredientQuantity.getQuantity();
            ingredient.take(requiredQuantity);
            System.out.printf("Adding %f amount of %s\n", requiredQuantity, ingredient.getIngredient().name());
        }
        System.out.println("Your beverage is prepared, please enjoy!\n");
    }

    @Override
    public String getName() {
        return beverage.name();
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public BeverageEnum getBeverage() {
        return beverage;
    }

    @Override
    public List<IngredientQuantity> getRequiredIngredients() {
        return requiredIngredients;
    }
}
