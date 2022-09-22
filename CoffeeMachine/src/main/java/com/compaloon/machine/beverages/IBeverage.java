package com.compaloon.machine.beverages;

import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.inventory.IIngredient;

import java.util.List;

public interface IBeverage {
    public void prepare(Size size);
    public String getName();
    public double getPrice();
    public BeverageEnum getBeverage();
    public List<IngredientQuantity> getRequiredIngredients();
}
