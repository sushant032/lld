package com.compaloon.machine.vendingmachines;

import com.compaloon.machine.OrderManagement.OrderService;
import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.beverages.BeverageService;
import com.compaloon.machine.inventory.InventoryService;

public interface IVendingMachine {
    BeverageService getBeverageService();
    InventoryService getIngredientService();
    OrderService getOrderService();
    void displayBeverages();
    void takeOrder(int id, String name, Size size);
}
