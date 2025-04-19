package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouseList;
    WarehouseStrategy warehouseStrategy;

    public WarehouseController(WareHouseStrategyEnum strategy,List<Warehouse> warehouseList)
    {
        this.warehouseList=new ArrayList<>();
        if(strategy==WareHouseStrategyEnum.NEAREST)
            this.warehouseStrategy=new NearestWarehouseStrategy();
        else if(strategy==WareHouseStrategyEnum.CHEAPEST)
            this.warehouseStrategy=new CheapestWarehouseStrategy();
        this.warehouseList=warehouseList;
    }
    public Warehouse findWarehouse(User user)
    {
        return this.warehouseStrategy.findWarehouse(warehouseList,user);
    }
}
