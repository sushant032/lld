package com.compaloon.machine.OrderManagement;

import com.compaloon.machine.beverages.IngredientQuantity;
import com.compaloon.machine.exceptions.LessInventoryException;
import com.compaloon.machine.inventory.InventoryService;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private static volatile OrderService orderService;
    List<Order> orders;
    private OrderService(){
        orders = new ArrayList<>();
    }

    public static OrderService getInstance() {
        if(orderService==null){
            synchronized (OrderService.class){
                if(orderService==null){
                    orderService = new OrderService();
                }
            }
        }
        return orderService;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void placeOrder(Order order, InventoryService inventoryService) {
        orders.add(order);
    }
}
