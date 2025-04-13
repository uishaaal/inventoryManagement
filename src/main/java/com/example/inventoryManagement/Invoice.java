package com.example.inventoryManagement;

public class Invoice {
    double totalAmount;
    double tax;

    public Invoice(double totalAmount, double tax) {
        this.totalAmount = totalAmount;
        this.tax = tax;
    }
}
