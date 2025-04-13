package com.example.inventoryManagement;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<Integer,Integer> productVsCountMap;
    public Cart()
    {
        this.productVsCountMap=new HashMap<>();
    }

    public Map<Integer, Integer> getProductVsCountMap() {
        return productVsCountMap;
    }

    public void addProductToCart(int id, int count){
        if(this.productVsCountMap.containsKey(id))
        {
            this.productVsCountMap.put(id,this.productVsCountMap.get(id)+1);
        }
        else{
            this.productVsCountMap.put(id,1);
        }
    }
    public void removeItemFromCart(int id)
    {
        if(this.productVsCountMap.get(id)>1)
        {
            this.productVsCountMap.put(id,this.productVsCountMap.get(id)-1);
        }
        else{
            this.productVsCountMap.remove(id);
        }
    }
}
