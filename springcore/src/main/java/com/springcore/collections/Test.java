package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// This is the runner class for showing implementation of Collections in beans
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
        Emp emp1 = (Emp)ctx.getBean("emp1");
        System.out.println(emp1);
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
        

	}

}
