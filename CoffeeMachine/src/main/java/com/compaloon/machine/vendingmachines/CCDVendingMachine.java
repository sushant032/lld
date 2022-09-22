package com.compaloon.machine.vendingmachines;

import com.compaloon.machine.OrderManagement.Order;
import com.compaloon.machine.OrderManagement.OrderService;
import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.beverages.*;
import com.compaloon.machine.exceptions.LessInventoryException;
import com.compaloon.machine.inventory.*;
import lombok.Getter;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Getter
public class CCDVendingMachine implements IVendingMachine {
    InventoryService inventoryService;
    BeverageService beverageService;
    OrderService orderService;
    VendingMachinesEnum vendingMachinesEnum;

    public CCDVendingMachine() {
        initializeInventory();
        initializeBeverages();
        this.orderService = OrderService.getInstance();
        this.vendingMachinesEnum = VendingMachinesEnum.CCD_VENDING_MACHINE;
    }

     void initializeInventory() {
        inventoryService = new InventoryService();
        List<IIngredient> ingredients = Arrays.asList(new Sugar(2000), new Milk(2000), new Water(2000));
        inventoryService.addIngredients(ingredients);
    }

    void initializeBeverages() {
        beverageService = new BeverageService();
        List<IBeverage> beverages = Arrays.asList(new Cappuccino(10, inventoryService), new Latte(12), new Mocha(15));
        beverageService.addIngredients(beverages);
    }

    @Override
    public BeverageService getBeverageService() {
        return beverageService;
    }

    @Override
    public InventoryService getIngredientService() {
        return inventoryService;
    }

    @Override
    public OrderService getOrderService() {
        return null;
    }

    @Override
    public void displayBeverages() {
        this.beverageService.displayBeverages();
    }

    @Override
    public void takeOrder(int id, String name, Size size) {
        IBeverage beverage = beverageService.getBeverages().get(id-1);
        Order order = Order.builder()
                .beverage(beverage)
                .from(vendingMachinesEnum.name())
                .id(UUID.randomUUID().toString())
                .name(name)
                .size(size)
                .price(beverage.getPrice())
                .time(Instant.now())
                .build();
        validateOrder(order);
        orderService.placeOrder(order, inventoryService);
        beverage.prepare(order.getSize());
    }

    void validateOrder(Order order){
        for(IngredientQuantity ingredientQuantity: order.getBeverage().getRequiredIngredients()){
            double availableQuantity = inventoryService.getIngredients().get(ingredientQuantity.getIngredient()).getQuantity();
            double requiredQuantity = ingredientQuantity.getQuantity() * order.getSize().getQuantity();
            if(availableQuantity<requiredQuantity){
                throw new LessInventoryException(500, "Inventory not sufficient");
            }
        }
    }
}
