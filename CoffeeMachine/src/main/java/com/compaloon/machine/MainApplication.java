package com.compaloon.machine;

import com.compaloon.machine.OrderManagement.Size;
import com.compaloon.machine.vendingmachines.IVendingMachine;
import com.compaloon.machine.vendingmachines.VendingMachineFactory;
import com.compaloon.machine.vendingmachines.VendingMachinesEnum;

public class MainApplication {

    public static void main(String[] args) {
        IVendingMachine ccdVendingMachine = VendingMachineFactory.getInstance(VendingMachinesEnum.CCD_VENDING_MACHINE);
        ccdVendingMachine.displayBeverages();
        ccdVendingMachine.takeOrder(1, "Sushant", Size.LARGE);
    }


}
