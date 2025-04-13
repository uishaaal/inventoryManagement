package com.example.inventoryManagement;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void makePayment(Order order) {
        System.out.println("Payment made through credit card");
        //can write code for payment through credit card
        order.setOrderStatus(OrderStatus.PAID);
    }
}
