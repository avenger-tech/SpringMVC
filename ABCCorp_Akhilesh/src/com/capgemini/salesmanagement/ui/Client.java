package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

import Exception.ProductException;

public class Client {
	private static Sale sale;
	
private static Scanner sc;
static ISaleService serref=new SaleService();
public static void main(String[] args) throws ProductException {
	sc = new Scanner(System.in);
	String name,category,prodDesc;
	int proCode,qty=0;
	float lineTotal=0,price;
	HashMap<Integer,Sale> nmap=new HashMap<>();
 	System.out.println();
 		System.out.println("Enter Product Details ");
 		System.out.println();
 		System.out.println("Enter the product code: ");
 		proCode=sc.nextInt();
 		if(serref.validateProductCode(proCode)==false) {
 			System.out.println(" The Code must be 1001 to 1004 ");
 			throw new ProductException();
 		}
 		System.out.println("Enter the quantity: ");
 		qty=sc.nextInt();
 		if(serref.validateQuantity(qty)==false) {
 			System.out.println(" Quantity Entered should be greater tha 0 and less than 5 ");
 			throw new ProductException();
 		}
 		System.out.println("Product Category: ");
 		category=sc.next();
 		
 		if(serref.validateProductCat(category)==false) {
 			System.out.println(" Category entered should be either Electronics or Toys ");
 			throw new ProductException();
 		}
 		
 		System.out.println("Product Name: ");
 		sc.nextLine();
 		name=sc.nextLine();
 		if(serref.validateProductName(name)==false) {
 			System.out.println(" Name Entered should be as follows "
 					+ "Electronics"
 					+ " -TV "
 					+ " -Smart Phone"
 					+ " -Video Game"
 					+ "Toys"
 					+ " -Soft Toy"
 					+ " -Telescope"
 					+ " -Barbee Doll");
 			throw new ProductException();
 			}
 		System.out.println("Product Description: ");
 		prodDesc=sc.nextLine();
 		System.out.println("Product Price(Rs): ");
 		price=sc.nextFloat();
 			if(serref.validateProductPrice(price)==false) {
 			System.out.println(" The price entered should be numeric and greater than 200 ");
 			throw new ProductException();
 			}
 			LocalDate date=LocalDate.now();
 			lineTotal=qty*price;
 			sale=new Sale(proCode,name,category,date,qty,lineTotal);
 		 	nmap=serref.insertSalesDetails(sale);
 		 	System.out.println("...Details Saved In the Hash Map Succesfully...");
 	System.out.println();
 int tqty=0;
 float total=0;
	for(Entry<Integer,Sale> x: nmap.entrySet()) {
		tqty=tqty+x.getValue().getQuantity();
	     total=total+x.getValue().getLineTotal();
	}
	
	System.out.println("....Your Bill....");
 	System.out.println("Total Quantity: "+tqty);
	System.out.println("Line Total(Rs): "+total);
	
	System.out.println();
    System.out.println("..Current Entries In Map are as Follows..");
    System.out.println("Sale-ID"+"\t|\t"+"Product Information");
 	for(Entry<Integer,Sale> x: nmap.entrySet()) 
		System.out.println(x.getKey()+"\t|\t"+x.getValue());
 	
}
	
}
