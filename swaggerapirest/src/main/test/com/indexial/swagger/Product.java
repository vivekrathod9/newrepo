package com.indexial.swagger;

public class Product {

	private int productId;
	private String prodcutName;
	private double productPrice;
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prodcutName=" + prodcutName + ", productPrice=" + productPrice
				+ "]";
	}
	public Product(int productId, String prodcutName, double productPrice) {
		super();
		this.productId = productId;
		this.prodcutName = prodcutName;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProdcutName() {
		return prodcutName;
	}
	public void setProdcutName(String prodcutName) {
		this.prodcutName = prodcutName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
