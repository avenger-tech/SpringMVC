package com.capgemini.takehome.service;

import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.ui.Product;

public class ProductService implements IProductService {
	private IProductDAO daoRef = new ProductDAO();

	@Override
	public Product getProductDetails(int productCode) {
		// TODO Auto-generated method stub
		return daoRef.getProductDetails(productCode);
	}

}
