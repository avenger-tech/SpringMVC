package com.capgemini.takehome.dao;

import com.capgemini.takehome.ui.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {
	
	
	public ProductDAO() {
		
	}

	@Override
	public Product getProductDetails(int productCode) {
		Product obj= (Product) CollectionUtil.products.get(productCode);
		
		return obj;
	}

}
