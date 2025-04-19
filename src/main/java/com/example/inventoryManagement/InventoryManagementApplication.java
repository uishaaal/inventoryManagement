package com.example.inventoryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InventoryManagementApplication {

	public static void main(String[] args) throws Exception{
		List<Warehouse> warehouseList=addWarehouse();

		List<User> userList=addUserList();

		ProductDeliverySystem productDeliverySystem=new ProductDeliverySystem(WareHouseStrategyEnum.NEAREST,warehouseList,userList);
		Warehouse warehouse=productDeliverySystem.findWarehouse(userList.get(01));
		productDeliverySystem.addItemToTheCart(userList.get(0).getId(),01,2);
		productDeliverySystem.addItemToTheCart(userList.get(1).getId(),03,3);
		Order order=productDeliverySystem.createOrder(userList.get(01),warehouse);
		productDeliverySystem.makePayment(order,PaymentStrategyEnum.UPI_PAYMENT);


	}
	public static List<User> addUserList(){
		User user1=new User(01,"Ajay Kumar",new Address(400002,"delhi","Delhi"));
		User user2=new User(02,"Vikas Yadav",new Address(400003,"Gurgaon","Haryana"));
		User user3=new User(03,"Nitish Singh",new Address(400004,"Noida","UP"));
		User user4=new User(04,"Anmol Bedi",new Address(400005,"delhi","Delhi"));
		List<User> userList=new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		return userList;
	}
	public static List<Warehouse> addWarehouse(){
		Product product1=new Product(01,"Pepsi");
		Product product2=new Product(02,"Coke");
		ProductCategory productCategory1=new ProductCategory(1,"SoftDrink",20.0);
		productCategory1.addProduct(product1);
		productCategory1.addProduct(product2);
		Product product3=new Product(03,"Lays");
		Product product4=new Product(04,"Cheetos");
		ProductCategory productCategory2=new ProductCategory(2,"Chips",10.0);
		productCategory2.addProduct(product3);
		productCategory2.addProduct(product4);
		Product product5=new Product(05,"Daily Milk");
		Product product6=new Product(06,"Snickers");
		ProductCategory productCategory3=new ProductCategory(3,"Chocolate",50.0);
		productCategory3.addProduct(product5);
		productCategory3.addProduct(product6);

		Inventory inventory=new Inventory();
		inventory.addProductCategory(productCategory1);
		inventory.addProductCategory(productCategory2);
		inventory.addProductCategory(productCategory3);

		Warehouse warehouse=new Warehouse();
		warehouse.setAddress(new Address(400001,"Delhi","Delhi"));
		warehouse.setInventory(inventory);
		List<Warehouse> warehouseList=new ArrayList<>();
		warehouseList.add(warehouse);
		return warehouseList;
	}
}
