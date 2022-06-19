package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
        A obj = (A)ctx.getBean("aref");
        System.out.println(obj.getX());
        System.out.println(obj.getOb().getY());


	}

}
