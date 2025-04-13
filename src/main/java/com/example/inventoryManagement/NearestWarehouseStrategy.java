package com.example.inventoryManagement;

import java.util.List;

public class NearestWarehouseStrategy implements WarehouseStrategy{

    @Override
    public Warehouse findWarehouse(List<Warehouse> warehouseList,User user) {
        return warehouseList.get(0);
    }
}
