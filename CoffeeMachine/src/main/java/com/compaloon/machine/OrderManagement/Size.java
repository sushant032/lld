package com.compaloon.machine.OrderManagement;

import lombok.Getter;

@Getter
public enum Size {
    SMALL(200),
    MEDIUM(300),
    LARGE(400);

    int quantity;

    Size(int quantity) {
        this.quantity = quantity;
    }
}
