package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
		Person obj = (Person)ctx.getBean("person1");
		System.out.println(obj);
		
		Adition obj1 =(Adition)ctx.getBean("add");
		obj1.doSum();

	}

}
