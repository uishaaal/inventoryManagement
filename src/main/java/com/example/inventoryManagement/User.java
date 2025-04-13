package com.example.inventoryManagement;

public class User {
    int id;
    String name;
    Address address;
    Cart cart;
    //List<Order> orderList;


    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cart=new Cart();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }

    public void addItemToCart(int id, int count)
    {
        this.cart.addProductToCart(id,count);
    }
    public void removeItemFromCart(int id)
    {
        this.cart.removeItemFromCart(id);
    }
}
