package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
	private int saleId;
	private int prodCode;
	private String productname;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	static int c;

	public Sale(int prodCode, String productname, String category, LocalDate saleDate, int quantity, float lineTotal) {
		c = (int) (Math.random() * 10000);
		this.saleId = c;
		this.prodCode = prodCode;
		this.productname = productname;
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}

	@Override
	public String toString() {
		return "[SaleId=" + saleId + ", Product Code=" + prodCode + ", Product Name=" + productname + ", Category="
				+ category + ", Sale Date=" + saleDate + ", Quantity=" + quantity + ", Line Total=" + lineTotal + "]";
	}

	

}
