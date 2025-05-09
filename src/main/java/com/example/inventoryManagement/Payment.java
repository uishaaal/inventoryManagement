package com.example.inventoryManagement;

import java.lang.reflect.Parameter;

public class Payment {
    PaymentStrategy paymentStrategy;
    public Payment(PaymentStrategyEnum strategy)
    {
        if(strategy==PaymentStrategyEnum.CREDIT_CARD){
            this.paymentStrategy=new CreditCardPayment();
        }
        else if(strategy==PaymentStrategyEnum.UPI_PAYMENT)
        {
            this.paymentStrategy=new UpiPayment();
        }
    }
    public void makePayment(Order order)
    {
        this.paymentStrategy.makePayment(order);

    }
}
