package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    int id;
    String productCategory;
    List<Product> productList;
    double price;

    public ProductCategory(int id, String productCategory,double price) {
        this.id = id;
        this.productCategory = productCategory;
        this.productList=new ArrayList<>();
        this.price=price;
    }
    public void addProduct(Product product){
        this.productList.add(product);
    }
    public void removeProduct(Product product)
    {
        this.productList.remove(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
