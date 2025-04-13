package com.example.inventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ProductCategory> productCategoryList;
    public Inventory()
    {
        this.productCategoryList=new ArrayList<>();
    }
    public void addProductCategory(ProductCategory productCategory)
    {
        ProductCategory searchproductCategory =productCategoryList.stream().filter(productCategory1 -> productCategory1.id==productCategory.getId()).findFirst().get();
        if(searchproductCategory!=null)
        {
            this.productCategoryList.add(productCategory);
        }
    }
    public void removeProductCategory(ProductCategory productCategory)
    {
        ProductCategory searchproductCategory =productCategoryList.stream().filter(productCategory1 -> productCategory1.id==productCategory.getId()).findFirst().get();
        if(searchproductCategory!=null)
        {
            this.productCategoryList.remove(productCategory);
        }
    }
}
