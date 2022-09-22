package com.compaloon.machine.OrderManagement;

import com.compaloon.machine.beverages.IBeverage;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    String id;
    String name;
    Instant time;
    Double price;
    String from;
    boolean completed;
    IBeverage beverage;
    Size size;
}
