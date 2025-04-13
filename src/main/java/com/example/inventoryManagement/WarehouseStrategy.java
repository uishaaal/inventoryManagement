package com.example.inventoryManagement;

import java.util.List;

public interface WarehouseStrategy {
    public Warehouse findWarehouse(List<Warehouse> warehouseList, User user);
}
