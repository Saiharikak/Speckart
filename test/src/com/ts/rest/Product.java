package com.ts.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int pid;
	private String pname;
	private String brand;
	
	private double price;
	private String pimage;

	public Product(int pid, String pname, String brand,double price,String pimage) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.price = price;
		this.pimage = pimage;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", brand=" + brand + ", price=" + price + ", pimage="
				+ pimage + "]";
	}

	

}
