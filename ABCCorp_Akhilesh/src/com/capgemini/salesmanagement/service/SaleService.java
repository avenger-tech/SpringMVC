package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;

public class SaleService implements ISaleService{
 ISaleDAO daoref;
static String catg;
 public SaleService() {
daoref=new SaleDAO(); 
 }	
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		return daoref.insertSalesDetails(sale);
	}
	@Override
	public boolean validateProductCode(int productId) {
		if(productId>=1001 && productId<=1004)
		return true;
		return false;
	}

	@Override
	public boolean validateQuantity(int qty) {
		if(qty>0 && qty<5)
		return true;
		return false;
	}

	@Override
	public boolean validateProductCat(String prodCat) {
		catg=prodCat;
		if(prodCat.equalsIgnoreCase("Electronics")||prodCat.equalsIgnoreCase("Toys"))
		return true;
		return false;
	}

	@Override
	public boolean validateProductName(String prodName) {
		if(catg.equals("Electronics")&&(prodName.equalsIgnoreCase("TV")||prodName.equalsIgnoreCase("Video Game")||prodName.equalsIgnoreCase("Smart Phone")))
		return true;
		else if(catg.equals("Toys")&&(prodName.equalsIgnoreCase("Soft Toy")||prodName.equalsIgnoreCase("Telescope")||prodName.equalsIgnoreCase("Barbee Doll")))
		return true;
		return false;
	}

	@Override
	public boolean validateProductPrice(float price) {
		if(price >200)
		return true;
		return false;
	}

}
