package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouseList;
    WarehouseStrategy warehouseStrategy;

    WarehouseController(WarehouseStrategy warehouseStrategy)
    {
        this.warehouseList=new ArrayList<>();
        this.warehouseStrategy=warehouseStrategy;
    }
    public Warehouse findWarehouse(User user)
    {
        return warehouseStrategy.findWarehouse(warehouseList,user);
    }
}
