package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
// this is called field injection ,because we are providing the value using the field , so this is called field injection
//	@Value("101")
//	private int id;
//	@Value("RealMe")
//	private String brand;
//	@Value("20000")
//	private double price;
//	
	
	// this code is for setter injection , because we are providing the value using setter mathod
//	private int id;
//	private String brand;
//	private double price;
//	
//	
//	public int getId() {
//		return id;
//	}
//	@Value("101")
//	public void setId(int id) {
//		this.id = id;
//	}
//	@Override
//	public String toString() {
//		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + "]";
//	}
//	
//	public String getBrand() {
//		return brand;
//	}
//	@Value("Apple")
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public double getPrice() {
//		return price;
//	}
//	@Value("120000")
//	public void setPrice(double price) {
//		this.price = price;
//	}	
	
	
//	this is my constructor injection , because we are providing the value using the constructor so it is called constructor injection
	private int id;
	private String brand;
	private double price;
	
	public Mobile(@Value("101") int id,@Value("samsung") String brand,@Value("85000") double price) {
		
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
		
}
