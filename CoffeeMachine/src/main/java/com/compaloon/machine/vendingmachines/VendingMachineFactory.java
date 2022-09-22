package com.compaloon.machine.vendingmachines;

import com.compaloon.machine.exceptions.NoSuchVendingMachineException;

public class VendingMachineFactory {
    public static IVendingMachine getInstance(VendingMachinesEnum vendingMachine) {
        switch (vendingMachine) {
            case CCD_VENDING_MACHINE:
                return new CCDVendingMachine();
            case STARBUCKS_VENDING_MACHINE:
                return new StarBucksVendingMachine();
        }
        throw new NoSuchVendingMachineException(400, "No such vending machine found");
    }
}
