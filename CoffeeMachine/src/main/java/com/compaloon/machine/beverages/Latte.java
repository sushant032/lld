package com.compaloon.machine.beverages;

import com.compaloon.machine.OrderManagement.Size;

import java.util.List;

public class Latte implements IBeverage {
    double price;
    BeverageEnum beverage;

    public Latte(double price){
        this.price = price;
        this.beverage = BeverageEnum.LATTE;
    }

    @Override
    public void prepare(Size size) {

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
        return null;
    }
}
