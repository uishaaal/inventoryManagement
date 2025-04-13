package com.example.inventoryManagement;


public class ProductDeliverySystem {
    WarehouseController warehouseController;
    UserController userController;

    OrderController orderController;

    public Warehouse findWarehouse(User user)
    {
        return warehouseController.findWarehouse(user);
    }
    public void addItemToTheCart(int userId,int productId,int count) throws Exception
    {
        User user=this.userController.getUser(userId);
        if(user!=null)
        {
            user.addItemToCart(productId,count);
        }
        else{
            throw new Exception("User not found");
        }
    }
    public void removeItemFromCart(int userId,int productId) throws Exception
    {
        User user=this.userController.getUser(userId);
        if(user!=null)
        {
            user.removeItemFromCart(productId);
        }
        else{
            throw new Exception("User not found");
        }
    }
    public void createOrder(User user,Warehouse warehouse)
    {
        Order order=orderController.createOrder(user,warehouse);
    }
    public void createInvoice(Order order)
    {
        //logic to calculate price or set add a variable inside order and cart with name price and keep updating it
        double price =200.0;
        double tax=price*0.18;
        order.invoice=new Invoice(price,tax);
    }
    public void makePayment(Order order,PaymentStrategyEnum strategy)
    {
        Payment payment=new Payment(strategy);
        payment.makePayment(order);
    }
}
