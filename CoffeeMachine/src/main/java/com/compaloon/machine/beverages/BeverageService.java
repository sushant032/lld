package com.compaloon.machine.beverages;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class BeverageService {
    List<IBeverage> beverages;

    public BeverageService() {
        beverages = new ArrayList<>();
    }

    public void addIngredient(IBeverage beverage) {
        beverages.add(beverage);
    }

    public void addIngredients(List<IBeverage> beverages) {
        this.beverages.addAll(beverages);
    }

    public void displayBeverages(){
        System.out.println("All the available beverages are: ");
        for(int i=1; i<=beverages.size(); i++){
            System.out.println(i+". "+beverages.get(i-1).getName());
        }
    }
}
