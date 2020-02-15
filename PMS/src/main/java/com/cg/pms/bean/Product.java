package com.cg.pms.bean;

public class Product
{

	private int productId;
	private String productName;
	private double price;
	
	public Product(int productId,String productName,double price)
	{
		super();
		this.productId=productId;
		this.productName=productName;
		this.price=price;
	}
	public Product()
	{
		super();
	}
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getProductId()
	{
		return productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public double getPrice()
	{
		return price;
	}
}
