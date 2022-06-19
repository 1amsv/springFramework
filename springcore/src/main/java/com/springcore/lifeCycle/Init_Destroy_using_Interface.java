package com.springcore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Init_Destroy_using_Interface  implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Init_Destroy_using_Interface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	//@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("INTERFACE takein pepsi");
		
	}

	//@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		System.out.println("INTERFACE Breakin bottle");
		
	}
	

}
