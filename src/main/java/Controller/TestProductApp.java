package Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Model.Cart;
import Model.Product;
import Utility.DBUtil;

public class TestProductApp 
{

	public static void main(String[] args) 
	{
		//linking mySQL Database
		//Invoking GetEntityManager() of DBUtil class
		EntityManager em = DBUtil.getEntityManager();
		
		//getting object of Entityransaction
		//EntityTransaction getTransaction()
		EntityTransaction et = em.getTransaction();
		
		//start or begin transaction
		//begin transaction
		et.begin();
		
		//creating object of cart
		Cart cart = new Cart();
		
		//creating object of product
		Product product = new Product();
		//setting all data or value with first object
		product.setProduct_Name("Laptop");
		product.setProduct_price(45000.00);
		product.setCart(cart);
		
		//setting all data or value with Second object
		Product product1 = new Product();
		product1.setProduct_Name("Mobile");
		product1.setProduct_price(25000.00);
		product1.setCart(cart);
		
		//getting a arraylistt object by invoking getProducts() Method
		List<Product> listofProduct = cart.getProducts();
		
		//adding all product object with list
		listofProduct.add(product);
		listofProduct.add(product1);
		
		//setting all product objects with cart object
		cart.setProducts(listofProduct);
		
		//Persisting all the entity objects with EntityManager object
		em.persist(cart);
		
		//commiting transaction
		et.commit();
		
	}

}
