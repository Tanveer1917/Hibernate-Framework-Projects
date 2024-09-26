package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "My_Product")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "p_id")
	private long product_code;
	@Column(name = "p_Name",nullable = false)
	private String product_Name;
	@Column(name = "p_price")
	private double product_price;
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	public long getProduct_code() {
		return product_code;
	}
	public void setProduct_code(long product_code) {
		this.product_code = product_code;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
}
