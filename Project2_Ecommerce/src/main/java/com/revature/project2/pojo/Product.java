package com.revature.project2.pojo;

public class Product {
private int productId;
private String productName;
private String category;
private double price;
private int inventoryStock;
private String description;
public Product() {
	super();
}

public Product(int productId, String productName, String category, double price, int inventoryStock,
		String description) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.category = category;
	this.price = price;
	this.inventoryStock = inventoryStock;
	this.description = description;
}

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getInventoryStock() {
	return inventoryStock;
}
public void setInventoryStock(int inventoryStock) {
	this.inventoryStock = inventoryStock;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + ", price="
			+ price + ", inventoryStock=" + inventoryStock + ", description=" + description + "]";
}


}
