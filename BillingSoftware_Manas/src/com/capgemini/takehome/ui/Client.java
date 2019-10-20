package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.exception.ProductCodeException;
import com.capgemini.exception.QuantityLessThanOrEqualToZeroException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	private static Scanner sc;

	public static void main(String[] args) throws QuantityLessThanOrEqualToZeroException, ProductCodeException {
		IProductService SerRef = new ProductService();
		System.out.println("1) Generate Bill by entering Product code and Quantity");
		System.out.println("2) Exit");
		sc= new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {

		case 1: {
			System.out.print("Enter the product Code:");
			int n1 = sc.nextInt();
			
			String s1 = String.valueOf(n1);
			if (s1.length() < 4) {
				throw new ProductCodeException();
			}

			if (n1 == 1001 || n1 == 1002 || n1 == 1003 || n1 == 1004)
			{
				System.out.print("Enter the quantity:");
				int n2 = sc.nextInt();
				if (n2 <= 0) {
					throw new QuantityLessThanOrEqualToZeroException();
				}
				System.out.println("Product Name:" + SerRef.getProductDetails(n1).product_name);
				System.out.println("Product Categoty:" + SerRef.getProductDetails(n1).product_category);
				System.out.println("Product Price:" + SerRef.getProductDetails(n1).product_price);
				System.out.println("Product Name:" + SerRef.getProductDetails(n1).product_name);
				System.out.println("Quantity:" + n2);
				int total = n2 * SerRef.getProductDetails(n1).product_price;

				System.out.println("Line Total(Rs):" + total);
				
				
			}
			else
			{
				System.out.println("Sorry! The Product Code<<"+n1+">>is not available.");
			}
				
		
		}
		break;
		case 2:{
			System.exit(0);
			
		}
		}

	}

}
