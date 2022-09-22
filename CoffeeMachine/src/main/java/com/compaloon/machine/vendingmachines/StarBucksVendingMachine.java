package com.compaloon.machine.vendingmachines;

import com.compaloon.machine.OrderManagement.OrderService;
import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.beverages.BeverageService;
import com.compaloon.machine.inventory.InventoryService;

public class StarBucksVendingMachine implements IVendingMachine {
    @Override
    public BeverageService getBeverageService() {
        return null;
    }

    @Override
    public InventoryService getIngredientService() {
        return null;
    }

    @Override
    public OrderService getOrderService() {
        return null;
    }

    @Override
    public void displayBeverages() {

    }

    @Override
    public void takeOrder(int id, String name, Size size) {

    }
}
