package com.compaloon.machine.beverages;

import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.inventory.IIngredient;

import java.util.List;

public class Mocha implements IBeverage {

    double price;
    BeverageEnum beverage;

    public Mocha(double price){
        this.price = price;
        this.beverage = BeverageEnum.MOCHA;
    }

    @Override
    public void prepare(Size size) {

    }

    @Override
    public String getName() {
        return "Mocha";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public List<IngredientQuantity> getRequiredIngredients() {
        return null;
    }

    @Override
    public BeverageEnum getBeverage() {
        return beverage;
    }

}
