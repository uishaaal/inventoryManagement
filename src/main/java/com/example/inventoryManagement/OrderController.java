package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class OrderController {
    List<Order> orderList;
    public void OrderController()
    {
        this.orderList=new ArrayList<>();
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
}
