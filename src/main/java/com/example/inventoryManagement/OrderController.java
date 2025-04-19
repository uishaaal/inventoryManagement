package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderController {
    HashMap<Integer,Order> orderList;
    public OrderController()
    {
        this.orderList=new HashMap<>();
    }
    public Order createOrder(User user,Warehouse warehouse){

        Order order =new Order(1);
        order.setUserId(user.getId());
        order.setOrderStatus(OrderStatus.CREATED);
        order.setProdVsCount(user.getCart().getProductVsCountMap());
        order.setUserAddress(user.getAddress());
        order.setWarehouse(warehouse);
        return order;

    }
    public void addOrder(Order order)
    {
        this.orderList.put(order.getId(), order);
    }
}
