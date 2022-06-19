package com.springcore.lifeCycle;

public class Init_Destroy_using_XML {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		
		this.price = price;
	}

	public Init_Destroy_using_XML() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hiBaby() {
		System.out.println("XML In init method: Hi baby, how you doin'");
		
	}
	public void byeBaby() {
		System.out.println("XML In destroy method: Its been nice fucking you.");
	}
	

}
