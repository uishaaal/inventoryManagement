package com.example.inventoryManagement;


import java.util.List;

public class ProductDeliverySystem {
    WarehouseController warehouseController;
    UserController userController;

    OrderController orderController;

    public ProductDeliverySystem(WareHouseStrategyEnum strategyEnum, List<Warehouse> warehouseList,List<User> userList) {
        this.warehouseController = new WarehouseController(strategyEnum,warehouseList);
        this.userController=new UserController(userList);
        this.orderController=new OrderController();
    }

    public Warehouse findWarehouse(User user)
    {
        return this.warehouseController.findWarehouse(user);
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
    public Order createOrder(User user,Warehouse warehouse)
    {
        Order order=orderController.createOrder(user,warehouse);
        return order;
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
        if(order.getOrderStatus()==OrderStatus.PAID)
        {
            postPayment(order);
        }
    }
    public void postPayment(Order order)
    {
        User user=userController.getUser(order.userId);
        addOrderToUserAndController(user,order);
        user.emptyCart();
    }
    public void addOrderToUserAndController(User user,Order order)
    {
        user.addOrder(order.getId());
        orderController.addOrder(order);
    }
}
