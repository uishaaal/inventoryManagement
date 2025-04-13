package com.example.inventoryManagement;

import java.util.HashMap;
import java.util.Map;

public class Order {
    int userId;
    int id;
    Address userAddress;
    Warehouse warehouse;
    Map<Integer,Integer> prodVsCount;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;

    public Order(int id)
    {
        this.id=id;
        this.prodVsCount=new HashMap<>();
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public void setUserAddress(Address userAddress) {
        this.userAddress = userAddress;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setProdVsCount(Map<Integer, Integer> prodVsCount) {
        this.prodVsCount = prodVsCount;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
