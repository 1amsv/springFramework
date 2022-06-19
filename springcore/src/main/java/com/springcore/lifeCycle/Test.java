package com.springcore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx =new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		ctx.registerShutdownHook();
		//registering shutdown hook for enabling destroy method in bean
		//this method is available in AbstractApplicationContext
		// not is ApplicationContext
		
		Init_Destroy_using_XML obj = (Init_Destroy_using_XML)ctx.getBean("samosa1");
		System.out.println(obj);
		
		Init_Destroy_using_Interface obj1 =(Init_Destroy_using_Interface)ctx.getBean("pepsi1");
		System.out.println(obj1);
		
		Init_Destroy_using_Annotations obj2 =(Init_Destroy_using_Annotations)ctx.getBean("chat1");
		System.out.println(obj2);
	}

}
