package com.example.inventoryManagement;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void makePayment(Order order) {
        System.out.println("Upi Payment done");
        order.setOrderStatus(OrderStatus.PAID);
    }
}
