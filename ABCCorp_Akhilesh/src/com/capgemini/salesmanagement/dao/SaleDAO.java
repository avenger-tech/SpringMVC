package com.capgemini.salesmanagement.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO {
	private HashMap<Integer,Sale> nmap;
	public SaleDAO() {
		nmap=CollectionUtil.getCollection();
		
		LocalDate date=LocalDate.now();
		Sale sale1=new Sale(1001,"TV","Electronics",date,0,0);
		nmap.put(sale1.getSaleId(), sale1);
		
		LocalDate date2=LocalDate.now();
		Sale sale2=new Sale(1002,"Smart Phone","Electronics",date2,0,0);
		nmap.put(sale2.getSaleId(), sale2);
		
		LocalDate date3=LocalDate.now();
		Sale sale3=new Sale(1003,"Video Game","Electronics",date3,0,0);
		nmap.put(sale3.getSaleId(), sale3);
		
		LocalDate date4=LocalDate.now();
		Sale sale4=new Sale(1004,"Telescope","Toys",date4,0,0);
		nmap.put(sale4.getSaleId(), sale4);
		
		LocalDate date5=LocalDate.now();
		Sale sale5=new Sale(1002,"Barbee Doll","Toys",date5,0,0);
		nmap.put(sale5.getSaleId(), sale5);
		
	}
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		nmap.put(sale.getSaleId(), sale);
		return nmap;
	}
	
	public Sale getInfo(int pro_Code)
	{
		int check;
		for(Entry<Integer,Sale> x: nmap.entrySet())
		{
			check=x.getValue().getProdCode();
			if(check==pro_Code)
				return x.getValue();
			//System.out.println(x.getKey()+" "+x.getValue().getProdCode());
		}
			return null;
		
	}
	
	
	
	

}
